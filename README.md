# NASA Website Testing Project

This project contains automated tests using Java, Selenium, Jenkins, Extent Reports, and TestNG to verify the NASA website's functionality.

## Test Scenarios

### Positive Tests

- **Missions Page Access**: Verifies access to the "Missions" page and checks for the NASA logo.
- **NASA News Share Stream**: Verifies sharing functionality on news pages.
- **NASA+ Video Playback**: Verifies video playback for NASA+ series.
- **Content Access & Video**: Checks search results for "Moon" and video functionality.
- **Footer Social Media Links**: Validates footer social media links.
- **Multimedia Images Page**: Verifies image gallery and download functionality.
- **Search Filter & Clean**: Tests Mars search with filters and clearing.
- **e-Book Download**: Validates download of the book "Archaeology, Anthropology, and Interstellar Communication".
- **Astronaut Profile & PDF**: Verifies astronaut profile page and PDF download.

### Negative Tests

- **Search Negative**: Tests search with empty input and special characters.
- **404 Error & Home Redirect**: Verifies 404 errors and home page redirection.
- **Newsletter Form Validation**: Tests invalid email and blank form submission.
- **XSS & SQL Injection**: Verifies the site’s response to XSS and SQL injection attempts.
- **Mars Search No Results**: Verifies no results message for Mars search with applied filters.
- **Broken Image Test**: Tests how the site handles missing images with image loading disabled.

## Tools & Technologies
- **Java**: Programming language for writing tests.
- **Selenium**: Tool for automating browser actions.
- **TestNG**: Testing framework for managing test cases.
- **Jenkins**: CI tool for running tests automatically.
- **Extent Reports**: Reporting tool for generating test results.

## Setup & Running Tests
1. Clone this repository.
2. Set up Java, Selenium WebDriver, and TestNG.
3. Run tests via TestNG and generate reports with Extent Reports.

## Conclusion
This repository ensures the proper functioning and security of the NASA website through positive and negative test cases.
