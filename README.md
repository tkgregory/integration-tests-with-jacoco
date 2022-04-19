Demonstrates how to publish unit and integration test Jacoco code coverage data to SonarQube.

See the accompanying article *[Integration Test Code Coverage with SonarQube and Jacoco](https://tomgregory.com/integration-test-code-coverage-with-sonarqube-and-jacoco/)* for full details.

## Running

Start SonarQube with `docker-compose up`. View your SonarQube server at [localhost:9000](http://localhost:9000).

Run `./gradlew sonarqube` which:

1. Compiles code and runs unit and integration tests
2. Generates test execution data [test.exec](build/jacoco/test.exec) and [integrationTest.exec](build/jacoco/integrationTest.exec)
3. Generates a combined Jacoco XML test report via *jacocoTestReport* task
4. Sends code coverage data to SonarQube
