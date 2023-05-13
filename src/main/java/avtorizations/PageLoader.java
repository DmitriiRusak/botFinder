package avtorizations;

import information.SorcePageInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoader {

    public void establishConnectionWithYouTube(ChromeDriver driver, WebDriverWait wait, SorcePageInformation sorcePageInformation) throws InterruptedException {
        driver.get("https://www.4everproxy.com/");
        //((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,600)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@class='group-stretch']"))));
        driver.manage().window().maximize();
        WebElement inputProxy = driver.findElement(By.xpath("//input[@class='group-stretch']"));
        inputProxy.sendKeys(sorcePageInformation.getBaseUrl());
        //inputInCroxyProxy.sendKeys("https://whoer.net/ru");
        driver.findElement(By.xpath("//button[@class='button-secondary']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='foreverproxy-u']"))));
        inputProxy=driver.findElement(By.xpath("//input[@id='searchbox']"));
        inputProxy.sendKeys(sorcePageInformation.getBaseUrl());
        inputProxy.sendKeys(Keys.ENTER);


    }

    public void establishConnection(ChromeDriver driver, WebDriverWait wait, SorcePageInformation sorcePageInformation) throws InterruptedException {
        driver.get(sorcePageInformation.getBaseUrl());
        //((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,600)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@class='group-stretch']"))));
        driver.manage().window().maximize();
        WebElement inputProxy = driver.findElement(By.xpath("//input[@class='group-stretch']"));
        inputProxy.sendKeys(sorcePageInformation.getBaseUrl());
        //inputInCroxyProxy.sendKeys("https://whoer.net/ru");
        driver.findElement(By.xpath("//button[@class='button-secondary']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='foreverproxy-u']"))));
        inputProxy=driver.findElement(By.xpath("//input[@id='searchbox']"));
        inputProxy.sendKeys(sorcePageInformation.getBaseUrl());
        inputProxy.sendKeys(Keys.ENTER);
    }
}
