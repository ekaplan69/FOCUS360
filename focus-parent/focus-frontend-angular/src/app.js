var app = angular.module("angularjs-starter", []);

app.config(function ($compileProvider) {
    $compileProvider.urlSanitizationWhitelist(
        /^\s*(https?|http|ftp|mailto|file|tel):/,
    );
});
