import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ICanWinTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod (alwaysRun = true)
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkPostBinTest() throws InterruptedException {

        wait = new WebDriverWait(driver,5);

        driver.get("https://privatebin.net/");
        WebElement searchInput = driver.findElement(By.id("message"));
        searchInput.sendKeys("Hello from WebDriver");
        WebElement searchExpiration = driver.findElement(By.id("expiration"));
        searchExpiration.click();
        WebElement choose10minExpiration = driver.findElement(By.xpath("//*[@id='navbar']/ul[1]/li[4]/ul/li[2]/a"));
        choose10minExpiration.click();
        WebElement searchButton = driver.findElement(By.id("sendbutton"));
        searchButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pastelink")));

        Assert.assertEquals(driver.getPageSource().contains("Ссылка на запись"), true, "No found text: Ссылка на запись!" );

        driver.quit();
    }

    @AfterMethod (alwaysRun = true)
    public void browserDown(){
        driver.quit();
        driver=null;
    }

}
