var app = angular.module('plunker', ["ngRoute"]);

app.controller('MainCtrl', function($scope) {
  $scope.name = 'World';
});


app.config(['$routeProvider', '$locationProvider',
  function($routeProvider, $locationProvider) {
    
    console.log('inside route provider');
    $routeProvider
      .when('/', {
        templateUrl: 'dashboard.html',
      })
      .when('/dashboard', {
        templateUrl: 'dashboard.html',
      })
      .when('/registrations', {
        templateUrl: '/registrations.html',
      })
      .when('/dropouts', {
        templateUrl: 'dropouts.html',
      })
      .when('/schedules', {
        templateUrl: 'schedules.html',
      })
      .when('/courses', {
        templateUrl: 'courses.html',
      })
      .when('/subjects', {
        templateUrl: 'subjects.html',
      })
      .when('/news', {
        templateUrl: 'news.html',
      })
      .when('/interactions', {
        templateUrl: 'interactions.html',
      })
      .when('/users', {
        templateUrl: '/users.html',
      });

    $locationProvider.html5Mode(true);
  }
])