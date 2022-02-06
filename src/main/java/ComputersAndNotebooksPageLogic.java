import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputersAndNotebooksPageLogic {

    private WebDriver driver;
    private WebDriverWait wait;

    By notebooksSection = By.xpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and contains(text(),' Ноутбуки ')]");
    By checkboxRozetkaSeller = By.xpath("//*[@href='/notebooks/c80004/seller=rozetka/']");
    By maxPriceInput = By.xpath("//input[@formcontrolname='max']");
    By buttonOk = By.xpath("//button[@type='submit' and contains(text(),' Ok ')]");
    By campaignElement = By.xpath("//app-label[@class='main-gallery__label ng-star-inserted']");


    public ComputersAndNotebooksPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public ComputersAndNotebooksPageLogic chooseNotebooksSection() {
        driver.findElement(notebooksSection).click();
        return this;
    }

    public ComputersAndNotebooksPageLogic setFilters() {
        driver.findElement(checkboxRozetkaSeller).click();
        driver.findElement(maxPriceInput).click();
        driver.findElement(maxPriceInput).clear();
        driver.findElement(maxPriceInput).sendKeys("100000");
        driver.findElement(buttonOk).click();
        driver.findElement(campaignElement);
        return this;
    }

}
