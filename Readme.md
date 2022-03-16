## Github - Project location

[Go to feedback-project in Github](https://github.com/medwargg/feedback-project)

##Gradle actions on the project

From command line enter the following command:

### Compile
_./gradlew clean compile_

### Build the project
_./gradlew clean build jacocoTestCoverageVerification_

### Build skipping tests
_./gradlew clean build -xtest_

### Run the application
_./gradlew clean bootRun_

### Generate the Jacoco report
_./gradlew jacocoTestReport_

## Notes

This project has the purpose of improving code skills.

The server runs on port 8081.

The Jacoco report is generated in **$buildDir/jacocoHtml/index.html**, click here to see [html report](build/jacocoHtml/index.html)