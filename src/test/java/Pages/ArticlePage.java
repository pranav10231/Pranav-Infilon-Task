package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ArticlePage {
    private WebDriver driver;

    // Locators
    private By submitButtonXpath = By.xpath("//input[@type='submit']");

    // Constructor
    public ArticlePage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollThroughtheArticle(){
        Actions actions = new Actions(driver);
        WebElement ScrollThroughSubmitButton = driver.findElement(submitButtonXpath);
        actions.scrollToElement(ScrollThroughSubmitButton).perform();
        driver.navigate().back();
    }
}
