module.exports = {
  javaKeywords: ['for', 'switch'], // TODO: if it's necessary add other keywords as well
  className: function () {
    return this.camelCase(this['name']);
  },
  baseClassName: function () {
    return this['extends'] ? this.camelCase(this['extends']) + 'Element' : 'PolymerElement';
  },
  baseWidgetName: function () {
    return this['extends'] ? this.camelCase(this['extends']) : 'PolymerWidget';
  },
  camelCase: function(s) {
    return (s || '').toLowerCase().replace(/(\b|-)\w/g, function (m) {
      return m.toUpperCase().replace(/-/, '');
    });
  },
  computeType: function(type) {
    if (type === 'string' || type === 'String') return 'String';
    if (type === 'boolean') return 'boolean';
    if (type === 'array') return 'JsArray';
    if (type === 'element' || type === 'Element') return 'Element';
    if (type === 'number' || type === 'Number') return 'double';
    return "Object";
  },
  hasEvents: function() {
    return !!this.events;
  },
  hasAttributes: function() {
    return !!this.attributes;
  },
  hasProperties: function() {
    return !!this.properties;
  },
  hasMethods: function() {
    return !!this.methods;
  },
  hasParams: function() {
    return !!this.params;
  },
  capitalizeFirstLetter: function(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  },
  computeGetter: function(item) {
    var name = item.name;
    if (this.startsWith(name, "detail.")) {
      name = name.substring("detail.".length);
    }
    if (this.javaKeywords.indexOf(name) >= 0) {
      return this.computeGetterWithPrefix(item);
    } else {
      return name;
    }
  },
  computeGetterWithPrefix: function(item) {
    var name = item.name;
    if (this.startsWith(name, "detail.")) {
      name = name.substring("detail.".length);
    }
    var prefix = item.type === 'boolean' ? 'is' : 'get';
    if (this.startsWith(name, prefix)) {
      return name;      
    } else {
      return prefix + this.capitalizeFirstLetter(name);
    }
  },
  computeSetter: function(item) {
    if (this.javaKeywords.indexOf(item.name) >= 0) {
      return this.computeSetterWithPrefix(item);
    } else {
      return item.name;
    }
  },
  computeSetterWithPrefix: function(item) {
    return 'set' + this.capitalizeFirstLetter(item.name);
  },
  startsWith: function (str, substr){
    return str.indexOf(substr) === 0;
  },
  typedParamsString: function(method) {
    var result = [];
    if (method.params) {
      method.params.forEach(function(param) {
        var type = this.computeType(param.type);
        result.push(type + ' ' + param.name);
      }, this);
    }
    return result.join(', ');
  },
  paramsString: function(method) {
    var result = [];
    if (method.params) {
      method.params.forEach(function(param) {
        result.push(param.name);
      }, this);
    }
    return result.join(', ');
  },
  extraSetter: function(attribute) {
    var type = this.computeType(attribute.type);
    if (type === 'String') {
      return '';      
    } else if (type === 'boolean') {
      return 'public void ' + this.computeSetterWithPrefix(attribute) + '(String ' + attribute.name + ') {\n' + 
        '        setBooleanAttribute("' + attribute.name + '", true);\n' +
        '    }';
    } else {
      return 'public void ' + this.computeSetterWithPrefix(attribute) + '(String ' + attribute.name + ') {\n' +
        '        getElement().setAttribute("' + attribute.name + '", ' + attribute.name + ');\n' +
        '    }';
    }
  }
};