import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogic {

    private WebDriver driver;
    private WebDriverWait wait;

    By computersAndNotebooks = By.xpath("//a[@class='menu-categories__link' and contains(text(),'Ноутбуки и компьютеры')]");

    public MainPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ComputersAndNotebooksPageLogic sideMenuOptions() {
        driver.findElement(computersAndNotebooks).click();
        return new ComputersAndNotebooksPageLogic(driver, wait);
    }

}
