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


public class HurtMePlenty {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();

    }

    @Test
    public void checkCalculatorEstimate() throws InterruptedException {

        wait = new WebDriverWait(driver,10);

        driver.get("https://cloud.google.com/");
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

        WebElement addGPU = driver.findElement(By.cssSelector(".ng-scope:nth-child(10) .md-container"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ng-scope:nth-child(10) .md-container")));
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

        WebElement clickAddToEstimate = driver.findElement(By.cssSelector(".layout-align-end-start:nth-child(17) > .md-raised"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".layout-align-end-start:nth-child(17) > .md-raised")));
        clickAddToEstimate.click();

        Assert.assertEquals(driver.getPageSource().contains("VM class: regular"), true, "No found text: VM class: regular" );
        Assert.assertEquals(driver.getPageSource().contains("Instance type: n1-standard-8"), true, "No found text: Instance type: n1-standard-8" );
        Assert.assertEquals(driver.getPageSource().contains("Region: Frankfurt"), true, "No found text: Region: Frankfurt" );
        Assert.assertEquals(driver.getPageSource().contains("Total available local SSD space 2x375 GiB"), true, "No found text: Total available local SSD space 2x375 GiB" );
        Assert.assertEquals(driver.getPageSource().contains("Commitment term: 1 Year"), true, "No found text: Commitment term: 1 Year" );
        Assert.assertEquals(driver.getPageSource().contains("USD 1,082.77"), true, "Estimation is not match to manual test!" );

    }

    @AfterMethod(alwaysRun = true)
    public void browserDown(){
        driver.quit();
        driver=null;
    }
}
