package avtorizations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import information.SorcePageInformation;

import java.time.Duration;

public class Avtorization2 extends Avtorization0{
    private final String email="botFinderVersion2@gmail.com";
    private final String password = "findABotAndKill2";

    public void avtorization(ChromeDriver driver, SorcePageInformation sorcePageInformation) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getSignInButton())));

        WebElement sign_in = driver.findElement(By.xpath(sorcePageInformation.getSignInButton()));
        sign_in.click();

        WebElement input = driver.findElement(By.xpath(sorcePageInformation.getInputForEmail()));
        input.sendKeys(email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getButtonNext())));
        driver.findElement(By.xpath(sorcePageInformation.getButtonNext())).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sorcePageInformation.getInputForPassword())));
        input=driver.findElement(By.xpath(sorcePageInformation.getInputForPassword()));
        input.sendKeys(password);
        driver.findElement(By.xpath(sorcePageInformation.getButtonNext())).click();
        System.out.println("Aвторизация2 прошла успешно");
        Thread.sleep(2000);
    }

}
