package utils;

import information.Answere;
import information.SorcePageInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScammerFinder {

    private final String whatsapp_𝟟𝟡𝟘𝟞𝟠𝟜𝟟𝟚𝟜𝟝𝟡 = "𝟟𝟡𝟘𝟞𝟠𝟜𝟟𝟚𝟜𝟝𝟡";
    private final String whatsapp_𝟕𝟗𝟎𝟓𝟖𝟖𝟒𝟒𝟏𝟓𝟑 = "𝟕𝟗𝟎𝟓𝟖𝟖𝟒𝟒𝟏𝟓𝟑";
    private final String ɯԋαƚʂαρρ_𝟽𝟿𝟶𝟻𝟾𝟾𝟷𝟷𝟼𝟿𝟸=  "𝟽𝟿𝟶𝟻𝟾𝟾𝟷𝟷𝟼𝟿𝟸";
    private final String What_sap_𝟸𝟷𝟸𝟼𝟾𝟾𝟸𝟶𝟸𝟺𝟺𝟺= "𝟸𝟷𝟸𝟼𝟾𝟾𝟸𝟶𝟸𝟺𝟺𝟺";
    private final String ɯԋαƚʂαρρ_𝟟𝟡𝟘𝟞𝟛𝟜𝟜𝟘𝟙𝟡𝟙 =  "𝟟𝟡𝟘𝟞𝟛𝟜𝟜𝟘𝟙𝟡𝟙";
    private final String 𝐖𝐡𝐚𝐭𝐬𝐀𝐩𝐩_𝟏𝟗𝟕𝟖_𝟓𝟎𝟕_𝟕𝟕𝟎𝟓 ="𝟏𝟗𝟕𝟖_𝟓𝟎𝟕_𝟕𝟕𝟎𝟓";
    private final String whatsapp0434 = "@whatsapp0434";
    private final String whatsapptc1kd = "@whatssap-tc1kd";

    private Answere answere=new Answere();

    public void findandReplayToScammerse(List<WebElement> allNumberedReplaydKoments,
                                         ChromeDriver driver,
                                         SorcePageInformation sorcePageInformation) throws InterruptedException {
        for (int i = 0; i < allNumberedReplaydKoments.size(); i++) {
            if (
                (allNumberedReplaydKoments.get(i).getText().contains(whatsapp0434)||allNumberedReplaydKoments.get(i).getText().contains(whatsapp_𝟟𝟡𝟘𝟞𝟠𝟜𝟟𝟚𝟜𝟝𝟡))
            ||  (allNumberedReplaydKoments.get(i).getText().contains(whatsapptc1kd)||allNumberedReplaydKoments.get(i).getText().contains(whatsapp_𝟕𝟗𝟎𝟓𝟖𝟖𝟒𝟒𝟏𝟓𝟑))
            ||  (allNumberedReplaydKoments.get(i).getText().contains(ɯԋαƚʂαρρ_𝟽𝟿𝟶𝟻𝟾𝟾𝟷𝟷𝟼𝟿𝟸))
            ||  (allNumberedReplaydKoments.get(i).getText().contains(𝐖𝐡𝐚𝐭𝐬𝐀𝐩𝐩_𝟏𝟗𝟕𝟖_𝟓𝟎𝟕_𝟕𝟕𝟎𝟓))
            ||  (allNumberedReplaydKoments.get(i).getText().contains(ɯԋαƚʂαρρ_𝟟𝟡𝟘𝟞𝟛𝟜𝟜𝟘𝟙𝟡𝟙))
            ||  (allNumberedReplaydKoments.get(i).getText().contains(What_sap_𝟸𝟷𝟸𝟼𝟾𝟾𝟸𝟶𝟸𝟺𝟺𝟺))) {
                String XpathToInpytaForAnAswer = sorcePageInformation.getPuthToInputForAnswer(allNumberedReplaydKoments.get(i));
                String xpthToAnswerButtonForAnAnswer=sorcePageInformation.getPuthTOButtonAnswerForAnAnswer(allNumberedReplaydKoments.get(i));

                WebElement buttonForReplayToScammer=allNumberedReplaydKoments.get(i);
                String apdatedXpath=sorcePageInformation.addlokalniiPytdoKnopkiReplayYScammera(buttonForReplayToScammer);
                buttonForReplayToScammer=driver.findElement(By.xpath(apdatedXpath));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", buttonForReplayToScammer);
                Thread.sleep(400);
                buttonForReplayToScammer.click();
                ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,400)");
                WebElement inputForAnswer=driver.findElement(By.xpath(XpathToInpytaForAnAswer));
                //inputForAnswer.sendKeys(answere.getAnswer());
                answere.makeAnAnswer(inputForAnswer);
                driver.findElement(By.xpath(xpthToAnswerButtonForAnAnswer)).click();
                Thread.sleep(3500000);//58 min.
                //break;
            }
            else System.out.println(allNumberedReplaydKoments.get(i).getText());
        }

    }
}
