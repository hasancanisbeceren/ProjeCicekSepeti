import org.junit.jupiter.api.Test;

public class Senaryo4_ÜrünAciklamaTest extends BaseTest {
    Steps steps = new Steps();
    //Test Adımları
    //1-Giriş yap
    //2-Giriş yapıldığının kontrolünü yap
    //3-Bilgilendirme pop-up'ını kapat
    //4-Elektronik kategorisine git
    //5-Rastgele ürün seçip detay sayfasına git
    //6-Ürünün Açıklama metnini ekrana bas
    //7-Çıkış Yap
    @Test
    public void productDescription(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","elektronik");
        steps.randomClick("div[class='products__item-img-container ratio-container']");
        steps.saveText("body > main > div.product__description > div > div > div > div.product__recipe-body.js-accordion-panel.active.no-border > div.product__description-text");
        steps.waitSecond(2);
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
