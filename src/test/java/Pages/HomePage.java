package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By aboutUsXpath = By.xpath("//ul[@class='tf-navbar__main-nav tf-navbar__main-nav--main']/li[4]");
    private By careerXpath = By.xpath("(//a[@href='/career'])[2]");


    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public void gotoTenforceLink(){
        driver.get("https://www.tenforce.com/");
    }

    public void gotoCareersPage(){
        WebElement aboutUsButton = driver.findElement(aboutUsXpath);
        WebElement careerButton = driver.findElement(careerXpath);
        Actions actions = new Actions(driver);
        Actions click1 = actions.moveToElement(aboutUsButton);
        click1.perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement DropDownOptions = wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        DropDownOptions.click();
    }






}
