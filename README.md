- I have created this project based on task given below : 
1. Open https://www.tenforce.com/
2. Go on Career page
3. Go on Life at Tenforce session
4. Open “Life of two interns” article and open it
5. Scroll through the article
6. Go back to Job openings and make sure there is the text “Feel free to send your
CV to job”



## 🚀 How to Run the Tests

To run this automation suite locally, ensure you have **Java (JDK 11 or higher)** and **Maven** installed, then follow these steps:

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/pranav10231/Pranav-Infilon-Task.git](https://github.com/pranav10231/Pranav-Infilon-Task.git)
   cd Pranav-Infilon-Task

2. Execute the test suite via Maven or import/open the files in IntelliJ and run the test file:
   mvn clean test

## 🚀 **Framework Choice Justification**

Industry Standard & Robustness: Java and Selenium offer unmatched community support, mature libraries, and highly stable browser automation drivers, making them ideal for handling structured web workflows.

Scalability & Maintenance: Pairing Java with a build management tool like Maven ensures effortless dependency management (via pom.xml) and seamless integration with CI/CD platforms like Jenkins.

Strong Assertions: The built-in testing framework allows for clean validation of text presence, page transitions, and structured test reporting

## 🚀 **Architecture Explanation**
This project follows the Page Object Model (POM) design pattern to achieve a clean separation of concerns. Under the src/test/java package, the application is split into two distinct layers: Pages and Tests. The Pages folder houses individual class files for each screen (HomePage, CareerPage, and ArticlePage). These classes act as repositories for web elements (UI locators) and encapsulate page-specific behaviors or actions as reusable methods

The Tests folder contains the actual test execution scripts. These scripts call the structural methods defined in the Page objects to perform actions

   
   
