package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo1_SıkSorulanSorularTesti extends BaseTest {
    Steps steps = new Steps();
    //Test Adımları
    //1-Giriş Yap
    //2-Giriş Yapıldığının Kontrolünü yap
    //3-Bilgilendirme pop-up ını kapat
    //4-Sıkça Sorulan Sorularag gir
    //5-Kargo ve teslimat sorularına git
    //6-seçilen sorunun açıklamasını ekrana bas
    //7-Çıkış yap

    @Test
    public void frequentlyAskedQuestions(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.waitSecond(1);
        steps.clickElement("body > div.footer > div.container.container--footer > ul:nth-child(5) > li:nth-child(3) > ul > li:nth-child(2)");
        steps.waitSecond(1);
        steps.clickElement("body > main > div > div.faq > div.faq__tab-panel > ul > li:nth-child(4)");
        steps.waitSecond(1);
        steps.clickElement("#accordion3000 > button");
        steps.saveText("#collapse3000 > div");
        steps.clickElement("a[class='user-menu__log-out']");

    }
}

