import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BringItOn {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void checkPostBinTest() throws InterruptedException {

        wait = new WebDriverWait(driver,5);

        driver.get("https://privatebin.net/");
        WebElement searchInput = driver.findElement(By.id("message"));
        searchInput.sendKeys("git config --global user.name  \"New Sheriff in Town\"");
        driver.findElement(By.id("message")).sendKeys(Keys.ENTER);
        searchInput.sendKeys("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")");
        driver.findElement(By.id("message")).sendKeys(Keys.ENTER);
        searchInput.sendKeys("git push origin master --force");
        WebElement searchExpiration = driver.findElement(By.id("expiration"));
        searchExpiration.click();
        WebElement choose10minExpiration = driver.findElement(By.xpath("//*[@id='navbar']/ul[1]/li[4]/ul/li[2]/a"));
        choose10minExpiration.click();
        WebElement searchButton = driver.findElement(By.id("sendbutton"));
        searchButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pastelink")));

        Assert.assertEquals(driver.getPageSource().contains("Ссылка на запись"), true, "No found text: Ссылка на запись!" );
        Assert.assertEquals(driver.getPageSource().contains("git config --global user.name  \"New Sheriff in Town\""), true, "No text: git config --global user.name  \"New Sheriff in Town\"");
        Assert.assertEquals(driver.getPageSource().contains("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\""), true, "No found text: git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")");
        Assert.assertEquals(driver.getPageSource().contains("git push origin master --force"), true, "No found text: git push origin master --force");

        driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void browserDown(){
        driver.quit();
        driver=null;
    }
}
