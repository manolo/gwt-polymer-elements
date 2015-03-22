module.exports = {
  javaKeywords: ['for', 'switch'], // TODO: if it's necessary add other keywords as well
  className: function () {
    return this.camelCase(this['name']);
  },
  baseClassName: function () {
    return this['extends'] ? this.camelCase(this['extends']) : 'PolymerElement';
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
    return "JavaScriptObject";
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
  capitalizeFirstLetter: function(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  },
  computeGetter: function(item) {
    if (this.javaKeywords.indexOf(item.name) >= 0) {
      var prefix = item.type === 'boolean' ? 'is' : 'get';
      return prefix + item.name;
    } else {
      return item.name;
    }
  },
  computeSetter: function(item) {
    if (this.javaKeywords.indexOf(item.name) >= 0) {
      return 'set' + item.name;
    } else {
      return item.name;
    }
  }
};