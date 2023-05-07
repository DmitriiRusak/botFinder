package runTheProgramm;

import avtorizations.Avtorization1;
import avtorizations.Avtorization2;
import information.SorcePageInformation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ComposerForRanner {

    private SorcePageInformation sorcePageInformation = new SorcePageInformation();
    private Avtorization2 avtorization = new Avtorization2();
    private ScammerFinder scammerFinder = new ScammerFinder();

    private Loadar loader = new Loadar();

    private List<WebElement> blocksOfKomments = new ArrayList();
    private List <WebElement> allNumberedReplaydKoments = new ArrayList();

    public void runTheProgramm() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get(sorcePageInformation.getBaseUrl());
        driver.manage().window().maximize();

        avtorization.avtorization(driver,sorcePageInformation);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("scroll(0, 950);");
        Thread.sleep(1000);


        blocksOfKomments = loader.downloadAllPresentedBlocksOfKommentsOnTheWebPage(blocksOfKomments, driver, sorcePageInformation);
        System.out.println("Нашол боков-коментариев в количестве - " + blocksOfKomments.size());


        allNumberedReplaydKoments = loader.openAndDownloadAllReplaydKoments(blocksOfKomments,
                                                                            driver,
                                                                            allNumberedReplaydKoments,
                                                                            avtorization.getMyNickname1(),
                                                                            avtorization.getMyNickname2(),
                                                                            sorcePageInformation);
        System.out.println("количество блоков ответов на коментарии - " + allNumberedReplaydKoments.size());


        scammerFinder.findandReplayToScammerse(allNumberedReplaydKoments,driver,sorcePageInformation);

    }
}