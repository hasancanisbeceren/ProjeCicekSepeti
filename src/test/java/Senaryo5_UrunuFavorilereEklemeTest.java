import org.junit.jupiter.api.Test;

public class Senaryo5_UrunuFavorilereEklemeTest extends BaseTest{
    Steps steps= new Steps();
    //Test Adımları
    //1-Giriş Yap
    //2-Giriş Yapıldığının kontrolünü yap
    //3-Bilgilendirme pop-up'ını kapat
    //4-"Çikolata" ürününü arat
    //5-Random bir ürünün detay sayfasına git
    //6-Ürünü favorilere ekle
    //7-Çıkış Yap

    @Test
    public void addProductToFavorites(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","çikolata");
        steps.randomClick("div[class='products__item-img-container ratio-container']");
        steps.clickElement("i[class='icon-favorite favorite__icon']");
        steps.waitSecond(1);
        steps.clickElement("a[class='user-menu__log-out']");


    }
}
