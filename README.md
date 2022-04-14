Demonstrate an issue with test suites & Jacoco reports

## Setup

This project has tests and integration tests in separate source sets configured with the JVM Test Suites plugin.

## Observation 1
Run `./gradlew jacocoTestReport` and see 2 files:

* *test.exec*
* *integrationTest.exec*

How does the *integrationTest.exec* get generated?

## Observation 2
There is a *build/reports/jacoco/test/jacocoTestReport.xml* but no *build/reports/jacoco/integrationTest/jacocoTestReport.xml*.

Why?

## Observation 3

When I try to configure *jacocoTestReport* task to include integration test data:

```groovy
jacocoTestReport {
    executionData tasks.named('integrationTest')
    // other stuff
}
```

When I run `./gradlew  jacocoTestReport` it fails with error:

> > Unable to read execution data file C:\workspace\sonarqube-jacoco-code-coverage\build\test-results\integrationTest\binary

Does this directory exist? Sure does!