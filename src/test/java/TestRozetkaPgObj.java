import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRozetkaPgObj {

//    Перейти на https://rozetka.com.ua/
//    В сайд меню перейти в раздел Ноутбуки и компьютеры
//    Перейти в категорию Ноутбуки
//    Примерить фильтр "Продавец" Rozetka
//    Примерить фильтр "Цена" установть цену до - 100000
//    Перейти на продуктовую первого товара с плашкой "Акция"
//    Проверить что на продуктовой странице отображается плашка "Акция

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void testRozetka() {
        new MainPageLogic(driver, wait);

        WebElement expectedCampaignElement = driver.findElement(By.xpath("//app-label[@class='main-gallery__label ng-star-inserted']"));
        Assert.assertTrue(expectedCampaignElement.isDisplayed(), "ELabel \"Акция\" doesn't appear");

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
