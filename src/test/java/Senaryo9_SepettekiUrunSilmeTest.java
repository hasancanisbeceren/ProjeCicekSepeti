import org.junit.jupiter.api.Test;

public class Senaryo9_SepettekiUrunSilmeTest extends BaseTest{
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Sepete Git
    // 5- Sepetteki ürünü sil
    // 6- Sepetin boş olduğunu kontrol et
    // 7- Çıkış Yap
    @Test
    public void emptyCart(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("body > div.header > div.container > div > div.header__right-col > div.user-menu-container.js-user-menu > nav > ul > li.user-menu__item.user-menu__item--shopping-cart > a");
        steps.clickElement("a[class='cart__item-delete icon-close js-main-product-delete--basket']");
        steps.clickElement("#modalBox > div > div > div.modal-footer > button.agree-button.btn.btn-primary");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--cart icon-cart-2 js-product-id-list']");
        steps.clickElement("body > main > div > div > a");
        steps.waitSecond(1);
        steps.clickElement("a[class='user-menu__log-out']");

    }
}
