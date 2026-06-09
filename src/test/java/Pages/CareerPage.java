package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CareerPage {
    private WebDriver driver;

    // Locators
    private By lifeAtTenforceSessionxpath = By.xpath("//nav[@class='tenforce[tabs] flex flex-wrap']/a[2]");
    private By lifeOfTwoInternsxpath = By.xpath("//section[@class='flex flex-wrap mb-24']/article[21]/a");
    private By JobOpeningsXpath = By.xpath("//nav[@class='tenforce[tabs] flex flex-wrap']/a[1]");
    private By sendCvXpath = By.xpath("//div[@class='relative flex flex-col justify-center h-full px-16 py-8']/div");


    // Constructor
    public CareerPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnLifeAtTenforceSession(){
        WebElement lifeAtTenForceSession = driver.findElement(lifeAtTenforceSessionxpath);
        lifeAtTenForceSession.click();
    }

    public void clickOnlifeOfTwoInterns(){
        WebElement lifeOfTwoInterns = driver.findElement(lifeOfTwoInternsxpath);
        lifeOfTwoInterns.click();
    }

    public void clickOnJobOpeningsButton(){
        WebElement jobOpeningsButton = driver.findElement(JobOpeningsXpath);
        jobOpeningsButton.click();
    }

    public void validateSendCvText(){
        WebElement sendCvText = driver.findElement(sendCvXpath);
        String cvText = sendCvText.getText();
        System.out.println("The Text we got is :"+cvText);
        Assert.assertEquals(cvText,"Feel free to send your CV to jobs@tenforce.com");
    }


}
