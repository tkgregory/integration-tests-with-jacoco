Demonstrates how to publish unit and integration test Jacoco code coverage data to SonarQube.
## Running

Start SonarQube with `docker-compose up`. View your SonarQube server at [localhost:9000](http://localhost:9000).

Run `./gradlew sonarqube` which:

1. Compiles code and runs unit and integration tests
2. Generates test execution data [test.exec](build/jacoco/test.exec) and [integrationTest.exec](build/jacoco/integrationTest.exec)
3. Generates a combined Jacoco XML test report via *jacocoTestReport* task
4. Sends code coverage data to SonarQube