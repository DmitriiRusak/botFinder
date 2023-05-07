package information;

import org.openqa.selenium.WebElement;

public class SorcePageInformation {

     private final String baseUrl = "https://www.youtube.com/watch?v=KphYB4YYLwI&list=PLAoxMwdIsDVntpJUpVPabilqR5S-j7kTZ&index=104";
    //private String baseUrl = "https://www.youtube.com/watch?v=gkcQ94nPDFc&list=PLAoxMwdIsDVntpJUpVPabilqR5S-j7kTZ&index=101";
    //private String baseUrl = "https://www.youtube.com/watch?v=pu41Hf80Y8k&list=PLAoxMwdIsDVntpJUpVPabilqR5S-j7kTZ&index=98";
    //private String baseUrl = "https://www.youtube.com/watch?v=pHH9GvYolhA";
    private final String signInButton="//a[@aria-label='Sign in']";

    private final String inputForEmail="//input[@jsname='YPqjbf']";

    private final String inputForPassword="//input[@type='password']";

    private final String pytDoBlockaKommentariev="//ytd-comment-thread-renderer[@class='style-scope ytd-item-section-renderer']";

    private final String pytDoVsexReplayButton="//div[@id='replies']";

    private final String pytDoYnikalnogoElementaVReplayButton="//div[@class='more-button style-scope ytd-comment-replies-renderer']";

    private final String pytDoYnikalnogoSpanElementaSNikomAvtora="//ytd-comment-renderer//span[@class=' style-scope ytd-comment-renderer']";

    private final String pytDoVsexOtvetovVReplayButtonKotorieMozznoPronymerovat="//ytd-comment-renderer";

    private final  String lokalniiPytdoKnopkiReplayYScammera="//div[@id='reply-button-end']";

    private final  String buttonNext="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']";

    private final String inputForAnAnswer="//div[@id='contenteditable-root']";

    private final String buttonAnswerForAnAnswer="//ytd-button-renderer[@id='submit-button']";

    private final String intputForAnAnswer = "//div[@id='contenteditable-root']";

    public String addNumberToTheAnswer(WebElement element, int a){
        String elementXpath=element.toString().substring(80, element.toString().length() - 1)+"["+String.valueOf(a)+"]";
        return elementXpath;
    }
    public String addlokalniiPytdoKnopkiReplayYScammera(WebElement element){
        String updatedXpathOfElement=element.toString().substring(80, element.toString().length() - 1)+lokalniiPytdoKnopkiReplayYScammera;
        return updatedXpathOfElement;
    }
    public String getPuthToInputForAnswer(WebElement element){
        String result=element.toString().substring(80, element.toString().length() - 1)+inputForAnAnswer;
        return result;
    }
    public String getPuthTOButtonAnswerForAnAnswer(WebElement element){
        String result=element.toString().substring(80, element.toString().length() - 1)+buttonAnswerForAnAnswer;
        return result;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getPytDoBlockaKommentariev() {
        return pytDoBlockaKommentariev;
    }

    public String getPytDoVsexReplayButton() {return pytDoVsexReplayButton; }

    public String getPytDoYnikalnogoElementaVReplayButton() {
        return pytDoYnikalnogoElementaVReplayButton;
    }

    public String getPytDoYnikalnogoSpanElementaSNikomAvtora() {
        return pytDoYnikalnogoSpanElementaSNikomAvtora;
    }

    public String getpytDoVsexOtvetovVReplayButtonKotorieMozznoPronymerovat() {
        return pytDoVsexOtvetovVReplayButtonKotorieMozznoPronymerovat;
    }

    public String getSignInButton() {
        return signInButton;
    }

    public String getInputForEmail() {
        return inputForEmail;
    }

    public String getButtonNext(){
        return buttonNext;
    }

    public String getInputForPassword() {
        return inputForPassword;
    }

    public String getInputForAnAnswer() {
        return inputForAnAnswer;
    }

}
