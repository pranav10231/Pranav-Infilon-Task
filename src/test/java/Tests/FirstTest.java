package Tests;

import Pages.ArticlePage;
import Pages.CareerPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void TenforceTask(){
        HomePage homePage = new HomePage(driver);
        CareerPage careerPage = new CareerPage(driver);
        ArticlePage articlePage = new ArticlePage(driver);

        //1.) Open https://www.tenforce.com/
        homePage.gotoTenforceLink();

        // 2.) Go on Career page
        homePage.gotoCareersPage();

        // 3.) Go on Life at Tenforce session
        careerPage.clickOnLifeAtTenforceSession();

        // 4.)  Open “Life of two interns” article and open it
        careerPage.clickOnlifeOfTwoInterns();

        // 5.) Scroll through the article
        articlePage.scrollThroughtheArticle();

        // 6.) 6. Go back to Job openings and make sure there is the text “Feel free to send your
        //CV to job”
        careerPage.clickOnJobOpeningsButton();
        careerPage.validateSendCvText();
    }

    @AfterMethod
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }


}
