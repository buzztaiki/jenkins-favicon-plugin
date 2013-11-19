(function() {
  var favicon = (function() {
    function replace(data) {
      var links = document.getElementsByTagName('link');
      var newLink;

      for (var i = 0; i < links.length; i++) {
        var link = links[i];
        if (link.rel === 'shortcut icon' || link.rel === 'icon') {
          link.parentNode.removeChild(link);
        }
      }

      newLink = document.createElement('link');
      newLink.setAttribute('rel', 'icon');
      document.getElementsByTagName('head')[0].appendChild(newLink);

      newLink.href = data.getAttribute('data-root-url') + data.getAttribute('data-favicon-path');
    }

    return {
      replace: replace
    };
  })();

  this['org.jenkinsci.plugins.favicon'] = favicon;
})();
