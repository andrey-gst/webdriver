import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://privatebin.net/");
        WebElement searchInput = driver.findElement(By.id("message"));
        searchInput.sendKeys("Hello from WebDriver");
        WebElement searchExpiration = driver.findElement(By.id("expiration"));
        searchExpiration.click();
        WebElement choose10minExpiration = driver.findElement(By.xpath("//*[@id='navbar']/ul[1]/li[4]/ul/li[2]/a"));
        choose10minExpiration.click();
        WebElement searchButton = driver.findElement(By.id("sendbutton"));
        searchButton.click();


        Thread.sleep(2000);
        driver.quit();
    }
}
