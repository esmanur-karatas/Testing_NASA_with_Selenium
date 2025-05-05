# 🚀 NASA Website Testing Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6347?style=for-the-badge&logo=apache&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
![Extent Reports](https://img.shields.io/badge/Extent_Reports-006400?style=for-the-badge&logo=report&logoColor=white)

---

This project contains automated tests developed with **Java**, **Selenium**, **Jenkins**, **Extent Reports**, and **TestNG** to verify the NASA website's functionality across multiple areas.

---

## 📋 Test Scenarios

### ✅ Positive Tests
- **Missions Page Access**: Verify access to the "Missions" page and presence of the NASA logo.
- **NASA News Share Stream**: Verify sharing functionality on news pages.
- **NASA+ Video Playback**: Verify video playback functionality for NASA+ series.
- **Content Access & Video**: Search for "Moon" and verify access to video content.
- **Footer Social Media Links**: Validate all footer social media links.
- **Multimedia Images Page**: Verify the image gallery and download functionality.
- **Search Filter & Clean**: Test the search functionality for "Mars" with filters and clearing.
- **e-Book Download**: Validate download of the e-Book "Archaeology, Anthropology, and Interstellar Communication".
- **Astronaut Profile & PDF**: Verify astronaut profile pages and PDF downloads.

### ❌ Negative Tests
- **Search Negative**: Test searches with empty input and special characters.
- **404 Error & Home Redirect**: Verify 404 error pages and redirection back to the homepage.
- **Newsletter Form Validation**: Test invalid email input and blank form submissions.
- **XSS & SQL Injection**: Verify the website’s response to XSS and SQL Injection attempts.
- **Mars Search No Results**: Test handling of no results when filters are applied.
- **Broken Image Test**: Verify site behavior when images fail to load.

---

## 🛠 Tools & Technologies

| Tool/Technology | Purpose |
| :-------------- | :------ |
| **Java**         | Programming language for writing tests |
| **Selenium WebDriver** | Browser automation tool |
| **TestNG**       | Testing framework for managing test cases |
| **Jenkins**      | CI/CD tool for automating test execution |
| **Extent Reports** | Reporting tool for test results |

---

## ⚙️ Setup & Running Tests

1. **Clone this repository**:

```bash
git clone https://github.com/your-username/nasa-website-testing.git
```

2. **Install/Set up the following**:
   - Java (JDK 8 or later)
   - Selenium WebDriver
   - TestNG

3. **Run tests** using TestNG.

4. **Generate reports** automatically using Extent Reports.

