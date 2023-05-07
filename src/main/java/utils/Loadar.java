package utils;

import information.SorcePageInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Loadar {
    private boolean reachedEnd=false;
    private List<WebElement> kommentsNewCount = new ArrayList<>();


    public List downloadAllPresentedBlocksOfKommentsOnTheWebPage(List <WebElement> blocksOfKommentsOldCount,
                                                                 ChromeDriver driver,
                                                                 SorcePageInformation sorcePageInformation) throws InterruptedException {
        blocksOfKommentsOldCount = driver.findElements(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()));
        while (!reachedEnd) {
            ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,2700)");
            Thread.sleep(4000);
            kommentsNewCount = driver.findElements(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()));

            if ((blocksOfKommentsOldCount.size() == kommentsNewCount.size()) && (blocksOfKommentsOldCount.size() != 20)) {
                reachedEnd = true;
            } else {
                blocksOfKommentsOldCount = kommentsNewCount;
            }
        }
        return blocksOfKommentsOldCount;
    }

    public List openAndDownloadAllReplaydKoments(List<WebElement> blocksOfKomments,ChromeDriver driver,
                                                 List<WebElement> allNumberedReplaydKoments,
                                                 String myNickName1,
                                                 String myNickName2,
                                                 SorcePageInformation sorcePageInformation) throws InterruptedException {
        Actions act = new Actions(driver);
        for (int i = 1; i < blocksOfKomments.size();i++) {
            WebElement allReplayButton=driver.findElement(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()+"["+i+"]"+sorcePageInformation.getPytDoVsexReplayButton()));
            if(allReplayButton.getAttribute("hidden")==null){
                //WebElement activeReplayButton=driver.findElement(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()+"["+i+"]"+sorcePageInformation.getPytDoVsexReplayButton()+sorcePageInformation.getPytDoYnikalnogoElementaVReplayButton()));
                WebElement activeReplayButton=driver.findElement(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()+"["+i+"]"+sorcePageInformation.getPytDoYnikalnogoElementaVReplayButton()));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", activeReplayButton);
                ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,100)");
                act.moveToElement(driver.findElement(By.xpath("//yt-icon[@id='logo-icon']"))).build().perform();    //otvodim kyrsor chtob ne zakrival element
                activeReplayButton.click();
                ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,600)");
                Thread.sleep(900);
                List<WebElement> allAnswersInTheBlockOfKomments=new ArrayList<>();
                allAnswersInTheBlockOfKomments=(driver.findElements(By.xpath(sorcePageInformation.getPytDoBlockaKommentariev()+"["+i+"]"+sorcePageInformation.getPytDoVsexReplayButton() +sorcePageInformation.getpytDoVsexOtvetovVReplayButtonKotorieMozznoPronymerovat())));

                //check for my komments, if I alredy left my komment, dont do it again
                for(int count=0; count<allAnswersInTheBlockOfKomments.size();count++){
                    if(allAnswersInTheBlockOfKomments.get(count).getText().contains(myNickName1) || allAnswersInTheBlockOfKomments.get(count).getText().contains(myNickName2)) {
                        allAnswersInTheBlockOfKomments.clear();
                        break;
                    }
                }
                for(int a=0;a<allAnswersInTheBlockOfKomments.size();a++){
                    String numberedReplay = sorcePageInformation.addNumberToTheAnswer(allAnswersInTheBlockOfKomments.get(a),a+1);
                    allNumberedReplaydKoments.add(driver.findElement(By.xpath(numberedReplay)));
                }
            }
        }
        return allNumberedReplaydKoments;
    }

}
