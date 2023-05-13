package runTheProgramm;

import avtorizations.Avtorization1;
import avtorizations.Avtorization2;
import avtorizations.Avtorization3;
import avtorizations.PageLoader;
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

    //private PageLoader pageLoader=new PageLoader();
    private SorcePageInformation sorcePageInformation = new SorcePageInformation();

    private Avtorization3 avtorization = new Avtorization3();

    private ScammerFinder scammerFinder = new ScammerFinder();
    private Loadar loader = new Loadar();
    private List<WebElement> blocksOfKomments = new ArrayList();
    private List <WebElement> allNumberedReplaydKoments = new ArrayList();

    public void runTheProgramm() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        //pageLoader.establishConnection(driver,wait,sorcePageInformation);
        driver.manage().window().maximize();

        driver.get(sorcePageInformation.getBaseUrl());

        avtorization.avtorization(driver,sorcePageInformation,wait);

        blocksOfKomments = loader.downloadAllPresentedBlocksOfKommentsOnTheWebPage(blocksOfKomments, driver, sorcePageInformation, wait);
        System.out.println("Нашол боков-коментариев в количестве - " + blocksOfKomments.size());


        allNumberedReplaydKoments = loader.openAndDownloadAllReplaydKoments(blocksOfKomments,
                                                                            driver,
                                                                            allNumberedReplaydKoments,
                                                                            avtorization.getMyNickname1(),
                                                                            avtorization.getMyNickname2(),
                                                                            avtorization.getMyNickname3(),
                                                                            sorcePageInformation);
        System.out.println("количество блоков ответов на коментарии - " + allNumberedReplaydKoments.size());


        scammerFinder.findandReplayToScammerse(allNumberedReplaydKoments,driver,sorcePageInformation);

    }
}