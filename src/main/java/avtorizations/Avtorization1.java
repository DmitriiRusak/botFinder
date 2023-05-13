package avtorizations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import information.SorcePageInformation;

import java.time.Duration;

public class Avtorization1 extends Avtorization0{

    private final String email = "botfinderversion1@gmail.com";
    private final String password = "findABotAndKill";

    public void avtorization(ChromeDriver driver, SorcePageInformation sorcePageInformation, WebDriverWait wait) throws InterruptedException {

        //press sign in
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getSignInButton())));
        WebElement sign_in = driver.findElement(By.xpath(sorcePageInformation.getSignInButton()));
        sign_in.click();

        //press input for email ans send email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getInputForEmail())));
        WebElement input = driver.findElement(By.xpath(sorcePageInformation.getInputForEmail()));
        input.sendKeys(email);

        //press next
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getButtonNext())));
        driver.findElement(By.xpath(sorcePageInformation.getButtonNext())).click();

        //press input for password and send password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getInputForPassword())));
        input = driver.findElement(By.xpath(sorcePageInformation.getInputForPassword()));
        input.sendKeys(password);

        //press next
        driver.findElement(By.xpath(sorcePageInformation.getButtonNext())).click();

        //ozzidanie poiavleniia avatarki
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getavatarka())));
        System.out.println("Aвторизация1 прошла успешно");
        Thread.sleep(2000);
        }
}


