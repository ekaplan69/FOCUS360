// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html

module.exports = function (config) {
    config.set({
        basePath: "",
        frameworks: ["jasmine", "@angular-devkit/build-angular"],
        plugins: [
            require("karma-jasmine"),
            require("karma-jasmine-html-reporter"),
            require("karma-coverage-istanbul-reporter"),
            require("@angular-devkit/build-angular/plugins/karma"),
            require("karma-firefox-launcher"),
            require("karma-junit-reporter"),
        ],
        client: {
            clearContext: false, // leave Jasmine Spec Runner output visible in browser
        },
        coverageIstanbulReporter: {
            dir: require("path").join(__dirname, "../coverage"),
            reports: ["html", "lcovonly"],
            fixWebpackSourcePaths: true,
        },
        reporters: ["progress", "kjhtml", "junit"],
        junitReporter: {
            outputDir: "../target/surefire-reports",
            outputFile: "test-results.xml",
        },

        port: 9876,
        colors: true,
        logLevel: config.LOG_INFO,
        autoWatch: true,
        browsers: ["FirefoxHeadless"],
        singleRun: true,
        captureTimeout: 210000,
        browserDisconnectTolerance: 3,
        browserDisconnectTimeout: 210000,
        browserNoActivityTimeout: 210000,
    });
};
