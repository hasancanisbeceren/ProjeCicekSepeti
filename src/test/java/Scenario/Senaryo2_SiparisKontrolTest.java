package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo2_SiparisKontrolTest extends BaseTest {

    Steps steps = new Steps();
    //Test Adımları
    //1-Giriş Yap
    //2-Giriş yapıldığını kontrol et******
    //3-Bilgilendirme Pop-up'unu kapat
    //4-Sipariş takibi sayfasına git
    //5-Sipariş olup olmadığını kontrol et*****
    //6-Çıkış yap


    @Test
    public void orderControl(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.waitSecond(1);
        steps.clickElement("body > div.header > div.container > div > div.header__right-col > div.user-menu-container.js-user-menu > nav > ul > li:nth-child(2) > a > span.user-menu__title");
        //steps.getTextControlTest("body > main > div > div > div.account__right > div > div","Sipariş bulunamadı. Lütfen bilgilerinizi kontrol ediniz.");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
