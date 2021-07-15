package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo6_FavoridenKaldirmaTest extends BaseTest {
    Steps steps = new Steps();
    //Test Adımları
    //1-Giriş yap
    //2-Giriş Yapıldığını kontrol et
    //3-Bilgilendirme pop-up'ını kapat
    //4-Favorilere git
    //5-Favorilere eklenmiş ürünü kaldır
    //6-Favorilerin boş olduğunu kontrol et*****
    //7-Çıkış yap

    @Test
    public void emptyFavorites(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--favorite icon-favorite-border']");
        steps.clickElement("span[class='products__favorite-icon js-favorite-add js-stop-productClick-event  add-favorite']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--favorite icon-favorite-border']");
        //steps.getTextControlTest("body > main > div > div > div.account__right > div > p","Dilerseniz ürünlerimize göz atarak favori ürünlerinizi seçebilirsiniz.");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
