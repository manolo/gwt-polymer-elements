module.exports = {
  javaKeywords: ['for', 'switch'], // TODO: if it's necessary add other keywords as well
  className: function () {
    return this.camelCase(this['name']);
  },
  baseClassName: function () {
    var e = this['extends'];
    if (e && e.match(/[A-Z\-]/)) {
      // CoreResizable -> CoreResizableElement, core-input -> CoreInputElment
      return this.camelCase(e) + 'Element';
    } else {
      // input -> HTMLInputElement, table -> HTMLTableElement
      return 'HTML' + (e ? this.camelCase(e) : '') + 'Element';
    }
  },
  baseWidgetName: function () {
    var e = this['extends'];
    if (e && e.match(/[A-Z\-]/)) {
      // CoreResizable -> CoreResizable, core-drop-downBase -> CoreDropdownBase
      return this.camelCase(e);
    } else {
      return 'PolymerWidget';
    }
  },
  camelCase: function(s) {
    return (s || '').replace(/[^\-\w\.]/g,'').replace(/(\b|-|\.)\w/g, function (m) {
      return m.toUpperCase().replace(/[-\.]/g, '');
    });
  },
  computeMethodName: function(s) {
    return (s || '').replace(/-\w/g, function (m) {
      return m.toUpperCase().replace(/-/, '');
    });
  },
  computeName: function(s) {
    return (s || '').replace(/[^\w\-\.:]/g, '');
  },
  computeType: function(t) {
    if (/^string$/i.test(t)) return 'String';
    if (/^boolean/i.test(t)) return 'boolean';
    if (/^array/i.test(t)) return 'JsArray';
    if (/^element/i.test(t)) return 'Element';
    if (/^number/i.test(t)) return 'double';
    if (/^function/i.test(t)) return 'Function';
    return "JavaScriptObject";
  },
  removeDuplicates: function(arr, prop) {
    for (var i = 0; i < arr.length; i++) {
      for (var j = arr.length - 1; j > i; j--) {
        if (arr[i][prop] == arr[j][prop]) {
          arr.splice(j, 1);
        }
      }
    }
  },
  removePrivateApi: function(arr, prop) {
    for (var i = arr.length - 1; i >= 0; i--) {
      if (/^_/.test(arr[i][prop])) {
        arr.splice(i, 1);
      }
    }
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
      return this.computeMethodName(name);
    }
  },
  computeGetterWithPrefix: function(item) {
    var name = item.name.replace(/^detail\./,'');
    var prefix = /^boolean/i.test(item.type) ? 'is' : 'get';
    if (this.startsWith(name, prefix)) {
      return name;
    } else {
      return prefix + this.capitalizeFirstLetter(this.computeMethodName(name));
    }
  },
  computeSetter: function(item) {
    if (this.javaKeywords.indexOf(item.name) >= 0) {
      return this.computeSetterWithPrefix(item);
    } else {
      return this.computeMethodName(item.name);
    }
  },
  computeSetterWithPrefix: function(item) {
    return 'set' + this.capitalizeFirstLetter(this.computeMethodName(item.name));
  },
  startsWith: function (str, substr){
    return str.indexOf(substr) === 0;
  },
  typedParamsString: function(method) {
    var result = [];
    if (method.params) {
      method.params.forEach(function(param) {
        var type = this.computeType(param.type);
        result.push(type + ' ' + this.computeMethodName(param.name));
      }, this);
    }
    return result.join(', ');
  },
  paramsString: function(method) {
    var result = [];
    if (method.params) {
      method.params.forEach(function(param) {
        result.push(this.computeMethodName(param.name));
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
      return 'public void ' + this.computeSetterWithPrefix(attribute) + '(String ' + this.computeMethodName(attribute.name) + ') {\n' +
        '        getElement().setAttribute("' + attribute.name + '", ' + this.computeMethodName(attribute.name) + ');\n' +
        '    }';
    }
  },
  getDescription: function(spaces, o) {
    o = o || this;
    return (o.description || o.desc || '').trim().split('\n').join('\n' + spaces + '* ').replace(/\*\//g, "* /");
  },
  disclaimer: function() {
    return "/**\n" +
           " * Copyright (c) 2015 Vaadin Components.\n" +
           " * This code was generated with Vaadin GWT Generator, an\n" +
           " * Apache 2.0 Licensed library developed at Vaadin Labs.\n" +
           " */";
  }
};
