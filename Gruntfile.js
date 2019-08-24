var jsApp = [
    'src/main/javascript/**/*.module.js',
    'src/main/javascript/**/*.config.js',
    'src/main/javascript/**/*.service.js',
    'src/main/javascript/**/*.controller.js',
    'src/main/javascript/**/*.directive.js',
    'src/main/javascript/**/*.filter.js',
    'src/main/javascript/**/*.constant.js'
];

var jsVendor = [
    'node_modules/angular/angular.js',
    'node_modules/angular-route/angular-route.js'
];

module.exports = function(grunt) {
	


    // Project configuration.
    grunt.initConfig({
        concat: {
            "buildApp": {
                "src": jsApp,
                "dest": 'src/main/webapp/js/test-app.js'
            },
			"jsVendor": {
                    src: jsVendor,
                    dest: 'src/main/webapp/js/vendor.js'
            }
        },
		concurrent: {
			dist: {
				tasks: ['concat:buildApp','concat:jsVendor'],
				options: {
					logConcurrentOutput: true
				}
			}
        },
		watch: {
			js: {
				files: ['src/main/javascript/**/*.js'],
				tasks: ['concat:buildApp']
			}
		}
    });

    // Load required modules
    grunt.loadNpmTasks('grunt-contrib-concat');
	grunt.loadNpmTasks('grunt-concurrent');
	grunt.loadNpmTasks('grunt-contrib-watch');

    // Task definitions
    grunt.registerTask('default', ['concat']);
	grunt.registerTask('dist', ['concurrent:dist']);
	grunt.registerTask('ver', ['watch:js']);
};