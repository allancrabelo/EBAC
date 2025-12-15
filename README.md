JUnit is a testing framework for Java that allows you to write and run automated unit tests for methods or classes. It helps ensure that your code works correctly and makes it easier to detect errors quickly.

## How to use:

Add JUnit to your project (via Maven, Gradle, or manually).

Create a separate test class.

Use annotations such as:

`@Test` → marks a method as a test.

`@BeforeEach` → runs before each test.

`@AfterEach` → runs after each test.

Use assertion methods to check results: assertEquals(expected, actual), assertTrue(condition), etc.

Run the tests in your IDE or via command line.

## What it does:

Automates test execution.

Helps check if code changes break existing functionality.

Ensures your code remains reliable and safe during development.