(function() {
	'use strict';
	angular.module('apptest', ['ngRoute','apptest.contentone','apptest.contenttwo']);	
})();
(function() {
	'use strict';
	angular.module('apptest.contentone', [ 'ngRoute']); 
})();
(function() {
	'use strict';
	angular.module('apptest.contenttwo', [ 'ngRoute']); 
})();
(function () {
    'use strict';

    angular.module('apptest')
        .config(['$routeProvider', config]);
    
    function config($routeProvider) {

        $routeProvider.when('/', {
            templateUrl: 'contentone/contentone.view.html'
        });

    }
})();
(function () {
    'use strict';

    angular.module('apptest.contentone')
        .config(['$routeProvider', config]);

    function config($routeProvider) {

        $routeProvider.when('/contentone', {
        	templateUrl: 'contentone/contentone.view.html'
        });

    }
})();
(function () {
    'use strict';

    angular.module('apptest.contenttwo')
        .config(['$routeProvider', config]);

    function config($routeProvider) {

        $routeProvider.when('/contenttwo', {
            templateUrl: 'contenttwo/contenttwo.view.html'
        });

    }
})();