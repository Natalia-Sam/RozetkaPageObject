import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageLogic {

    private WebDriver driver;
    private WebDriverWait wait;

    By firstCampaignProduct = By.xpath("//div[@class='goods-tile__inner']/span[contains(@class, 'goods-tile__label promo-label promo-label_type_action ng-star-inserted')]/..");

    public ProductPageLogic (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ProductPageLogic chooseFirstCampaignProduct() {
        driver.findElement(firstCampaignProduct).click();
        return this;
    }
}
