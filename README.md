[![CI](https://github.com/tkgregory/integration-tests-with-jacoco/actions/workflows/gradle.yml/badge.svg)](https://github.com/tkgregory/integration-tests-with-jacoco/actions/workflows/gradle.yml)

Demonstrates how to publish unit and integration test Jacoco code coverage data to SonarQube.

See the accompanying article *[Integration Test Code Coverage with SonarQube and Jacoco](https://gradlehero.com/integration-test-code-coverage-with-sonarqube-and-jacoco)* for full details.

[<img src="Integration-Test-Code-Coverage-with-SonarQube-and-Jacoco.png" width="500" alt="Integration Test Code Coverage with SonarQube and Jacoco"/>](https://gradlehero.com/integration-test-code-coverage-with-sonarqube-and-jacoco)

## Running

Start SonarQube with `docker-compose up`. View your SonarQube server at [localhost:9000](http://localhost:9000).

Run `./gradlew sonarqube` which:

1. Compiles code and runs unit and integration tests
2. Generates test execution data *build/jacoco/test.exec* and *build/jacoco/integrationTest.exec*
3. Generates a combined Jacoco XML test report *build/reports/jacoco/test/jacocoTestReport.xml* via *jacocoTestReport* task
4. Sends code coverage data to SonarQube
