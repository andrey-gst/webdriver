import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hardcore {
    private WebDriver driver;
    private WebDriverWait wait;


    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkCalculatorEstimate() throws InterruptedException {

        wait = new WebDriverWait(driver,10);

        driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Google Cloud Platform Pricing Calculator")));
        driver.findElement(By.linkText("Google Cloud Platform Pricing Calculator")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("cloud-site"))));

        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");

        WebElement searchNumberOfInstances = driver.findElement(By.id("input_66"));
        searchNumberOfInstances.click();
        searchNumberOfInstances.sendKeys(Keys.ENTER, "4");

        WebElement searchOperationSystem = driver.findElement(By.cssSelector("#select_value_label_59 .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_59 .md-text")));
        searchOperationSystem.click();
        WebElement selectOperationSystem = driver.findElement(By.cssSelector("#select_option_68 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_68 > .md-text")));
        selectOperationSystem.click();

        WebElement searchMachineClass = driver.findElement(By.cssSelector("#select_value_label_60 > span:nth-child(1)"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_60 > span:nth-child(1)")));
        searchMachineClass.click();
        WebElement selectMachineClass = driver.findElement(By.cssSelector("#select_option_81 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_81 > .md-text")));
        selectMachineClass.click();

        WebElement searchSeries = driver.findElement(By.xpath("//*[@id='select_value_label_62']/span[1]/div"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='select_value_label_62']/span[1]/div")));
        searchSeries.click();
        WebElement selectSeries = driver.findElement(By.id("select_option_195"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("select_option_195")));
        selectSeries.click();

        WebElement searchMachineType = driver.findElement(By.cssSelector("#select_value_label_63 .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_63 .md-text")));
        searchMachineType.click();
        WebElement selectMachineType = driver.findElement(By.cssSelector("#select_option_376 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_376 > .md-text")));
        selectMachineType.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ng-scope:nth-child(11) .md-container")));
        WebElement addGPU = driver.findElement(By.cssSelector(".ng-scope:nth-child(11) .md-container"));
        addGPU.click();

        WebElement searchNumberOfGPU = driver.findElement(By.cssSelector("#select_value_label_408 > span:nth-child(1)"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_408 > span:nth-child(1)")));
        searchNumberOfGPU.click();
        WebElement selectNumberOfGPU = driver.findElement(By.id("select_option_415"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("select_option_415")));
        selectNumberOfGPU.click();

        WebElement searchGPUType = driver.findElement(By.cssSelector("#select_value_label_409 .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_409 .md-text")));
        searchGPUType.click();
        WebElement selectGPUType = driver.findElement(By.cssSelector("#select_option_422 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_422 > .md-text")));
        selectGPUType.click();

        WebElement searchLocalSSD = driver.findElement(By.cssSelector("#select_value_label_370 > span:nth-child(1)"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_370 > span:nth-child(1)")));
        searchLocalSSD.click();
        WebElement selectLocalSSD = driver.findElement(By.cssSelector("#select_option_397 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_397 > .md-text")));
        selectLocalSSD.click();

        WebElement searchDatacenterLocation = driver.findElement(By.cssSelector("#select_value_label_64 .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_64 .md-text")));
        searchDatacenterLocation.click();
        WebElement selectDatacenterLocation = driver.findElement(By.cssSelector("#select_option_212 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_212 > .md-text")));
        selectDatacenterLocation.click();

        WebElement searchCommitedUsage = driver.findElement(By.cssSelector("#select_value_label_65 > span:nth-child(1)"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_value_label_65 > span:nth-child(1)")));
        searchCommitedUsage.click();
        WebElement selectCommitedUsage = driver.findElement(By.cssSelector("#select_option_100 > .md-text"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select_option_100 > .md-text")));
        selectCommitedUsage.click();

        WebElement clickAddToEstimate = driver.findElement(By.cssSelector(".layout-align-end-start:nth-child(18) > .md-raised"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".layout-align-end-start:nth-child(18) > .md-raised")));
        clickAddToEstimate.click();

        WebElement searchEmailEstimateButton = driver.findElement(By.id("email_quote"));
        searchEmailEstimateButton.click();



        // Open site 10minutemail.com
        ((JavascriptExecutor)driver).executeScript("window.open('about:blank', '-blank')");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.com/");
        Thread.sleep(5000);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mail_address")));
        WebElement searchCopyEmailButton = driver.findElement(By.id("copy_address"));
        searchCopyEmailButton.click();

        // Back to Google Cloud Calculator
        driver.switchTo().window(tabs.get(0));

        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");

        WebElement element = driver.findElement(By.name("emailForm"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement searchEmailField = driver.findElement(By.id("input_493"));
        searchEmailField.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        WebElement searchSendEmailButton = driver.findElement(By.xpath("//button[@aria-label='Send Email']"));
        searchSendEmailButton.click();

        // Switch to 10minutemail.com
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Google Cloud Platform Price Estimate']")));
        WebElement searchEmail = driver.findElement(By.xpath("//*[text()='Google Cloud Platform Price Estimate']"));
        searchEmail.click();

        Assert.assertEquals(driver.getPageSource().contains("USD 1,082.77"), true, "Estimation is not match!" );

    }

    @AfterMethod(alwaysRun = true)
    public void browserDown(){
        driver.quit();
        driver=null;
    }

}
