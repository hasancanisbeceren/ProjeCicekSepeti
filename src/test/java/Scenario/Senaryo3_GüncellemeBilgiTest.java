package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo3_GüncellemeBilgiTest extends BaseTest {
    Steps steps = new Steps();

    //Test Adımları
    //1-Giriş yap
    //2-Giriş Yapıldığının kontrolünü yap*****
    //3-Bilgilendirme pop-up'ını kapat
    //4-Hesabım>Üyelik Bilgilerim'e git
    //5-Kurum adını "test" - Telefon numarasına "5443211232" -adrese "Ayvalık cunda adası" olarak güncelle
    //6-Çıkış yap

    @Test
    public void updateInformation(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("body > div.header > div.container > div > div.header__right-col > div.user-menu-container.js-user-menu > nav > ul > li.user-menu__item.user-menu__item--account > a > span.user-menu__icon.user-menu__icon--account.icon-user_2");
        steps.clickByXpath("//span[text()='Üyelik Bilgilerim']");
        steps.sendKeysToElementTest("#Phone","5443211232");
        steps.sendKeysToElementTest("#address","Ayvalık/Cunda Adası");
        steps.sendKeysToElementTest("#CompanyName","test");
        steps.clickByXpath("//button[text()='Güncelle']");
        steps.waitSecond(3);
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
