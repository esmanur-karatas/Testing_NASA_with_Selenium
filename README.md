# NASA Website Testing Project

This project is a set of automated tests using Java, Selenium, Jenkins, Extent Reports, and TestNG to verify the functionality of the NASA website (https://www.nasa.gov/). The tests include both positive and negative scenarios, ensuring that various aspects of the site are working as expected and handle edge cases properly.

## Test Scenarios

### Positive Test Scenarios

#### Easy Positive Test 1: Missions Page Access Test
1. Go to https://www.nasa.gov/
2. Click the "Explore" button in the top right corner.
3. Click on the "Missions" button in the drop-down menu.
4. Verify that the "Missions" link is displayed.
5. Click on the "Missions" link.
6. Verify that the NASA logo is visible at the top of the "Missions" page.

#### Easy Positive Test 2: NASA News Share Stream Test
1. Go to https://www.nasa.gov/
2. Click on "News & Events" in the top menu.
3. Click on "News & Events" in the drop-down menu.
4. Verify the "News Releases" heading.
5. Click on the first news item.
6. Verify the presence of images or videos.
7. Click on LinkedIn from the sharing buttons and verify the sharing screen.

#### Easy Positive Test 3: NASA+ Video Series Access and Playback Test
1. Go to https://www.nasa.gov/
2. Click on "News & Events" in the top menu.
3. Click on "Video Series on NASA+".
4. Verify the "Explore Series" title.
5. Click on "Our Alien Earth".
6. Click on the first video and then press play to verify the video is playing.

#### Intermediate Positive Test 1: Content Access and Video Verification Test with Moon Search
1. Go to https://www.nasa.gov/
2. Search for "Moon" in the search box and verify results.
3. Click on the first search result.
4. Scroll down to a video and verify it works by clicking it.

#### Intermediate Positive Test 2: NASA Footer Social Media Links Validation Test
1. Go to https://www.nasa.gov/
2. Click on the Facebook icon in the footer.
3. Verify the URL is "https://www.facebook.com/NASA".
4. Click the Instagram icon and verify the URL "https://www.instagram.com/nasa/".
5. Check the Twitter and YouTube icons as well for valid URLs.

#### Intermediate Positive Test 3: Multimedia Images Page Test
1. Go to https://www.nasa.gov/
2. Click on the "Multimedia" button and select "Images".
3. Scroll down and click "Go To Gallery".
4. Click a random image and verify the "Download" and "Share" buttons.

#### Difficult Positive Test 1: NASA Search Results Advanced Filtering and Cleaning Test
1. Go to https://www.nasa.gov/
2. Search for "Mars" and apply filters:
   - Content Type: Articles
   - Categories: Mars
   - Changed: Last Year
   - Language: English
3. Verify that filters are applied and can be cleared.

#### Difficult Positive Test 2: NASA e-Book Download Test
1. Go to https://www.nasa.gov/
2. Click on "Multimedia" and select "E-books".
3. Scroll to find the book "Archaeology, Anthropology, and Interstellar Communication".
4. Click the "Overview" button and download the e-book in E-pub format.

#### Difficult Positive Test 3: NASA Astronaut Profile and PDF Download Test
1. Go to https://www.nasa.gov/
2. Click on "Explore" and select "Humans in Space" > "Astronauts".
3. Select Don Petit and click on "View Donald Pettit Biography".
4. Download the PDF of the biography and verify it has been downloaded.

### Negative Test Scenarios

#### Easy Negative Test 1: NASA Search Negative Test
1. Go to https://www.nasa.gov/
2. Perform a search with no text and verify the "Sorry" message.

#### Easy Negative Test 2: NASA Search Special Character Test
1. Go to https://www.nasa.gov/
2. Enter a long string of special characters in the search box.
3. Verify the "Too Many Special Characters" message.

#### Easy Negative Test 3: NASA 404 Error and Home Redirect Test
1. Go to an invalid URL like "nasa.gov/abcxyz".
2. Verify the 404 error page.
3. Click on the NASA logo and verify it redirects to the homepage.

#### Intermediate Negative Test 1: NASA Search Special Character and Invalid Text Test
1. Go to https://www.nasa.gov/
2. Search for "!@#$%^&*()" and verify the "Sorry" message.
3. Search for "mARSSSS" and verify the "Sorry" message.

#### Intermediate Negative Test 2: NASA Newsletter Form Validation Test
1. Go to https://www.nasa.gov/
2. Navigate to "News & Events" and select "Newsletters".
3. Leave the form blank and click "Subscribe".
4. Verify the "This field is required" warning message.

#### Intermediate Negative Test 3: NASA Newsletter Invalid Email Test
1. Go to https://www.nasa.gov/
2. Navigate to "News & Events" > "Newsletters".
3. Enter an invalid email like "test@.com" and click "Subscribe".
4. Verify the "Please enter your email address in name@email.com format" message.

#### Difficult Negative Test 1: NASA XSS and SQL Injection Test
1. Go to https://www.nasa.gov/
2. Enter an XSS attack code in the search box and verify it displays as text.
3. Try SQL injection input and verify no errors occur.

#### Difficult Negative Test 2: NASA Mars Search No Results Test
1. Search for "Mars" and apply filters for "Gallery" and "Blogs".
2. Set the language to Spanish and apply the filters.
3. Verify the "Sorry, but nothing matched your search terms" message.

#### Difficult Negative Test 3: Broken Image Test
1. Disable image loading in your browser.
2. Navigate through the NASA website and verify that broken image icons are shown.
3. Verify the "alt" text for missing images.

## Tools and Technologies
- **Java**: The primary programming language for writing tests.
- **Selenium**: A tool for automating web browsers, used for interacting with the NASA website.
- **TestNG**: A testing framework for running test cases and generating reports.
- **Jenkins**: Continuous integration tool for automating the execution of test cases.
- **Extent Reports**: A reporting tool to generate detailed HTML reports.

## Running the Tests
1. Clone this repository.
2. Set up your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Configure your Selenium WebDriver and TestNG in your project.
4. Run the tests using TestNG and generate the test report with Extent Reports.

## Conclusion
This repository contains tests for the NASA website to ensure it works properly. The tests cover a range of positive and negative scenarios, ensuring the functionality and security of the site.
