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