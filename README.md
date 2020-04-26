# boot-person

This is a small example application to try out Spring Boot.

## Configuration
The application uses Undertow instead of Tomcat as its embedded webserver. This can be set in build.gradle. 

To prevent problems with the default port 8080 the applications runs on port 8090. This can be configured in the application.properties file in the main/resources folder.

## Gradle Tasks
This application uses Gradle as its build tool. You can use the following Gradle tasks to work with the application:

* bootRun: Build and runs the application on port 8090
* build: Builds a standalone runable jar in build/libs folder
* dependencyUpdates: Checks for available dependency updates
* test: Runs the existing tests.