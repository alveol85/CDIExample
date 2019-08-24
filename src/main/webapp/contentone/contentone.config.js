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