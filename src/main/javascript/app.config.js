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