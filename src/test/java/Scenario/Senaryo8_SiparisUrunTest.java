package Scenario;
import BasePage.BaseTest;
import Util.Steps;
import org.junit.jupiter.api.Test;

public class Senaryo8_SiparisUrunTest extends BaseTest {
    Steps steps = new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Arama çubuğa "çiçek" yaz ve o sayfaya git
    // 5- İlk Elemanı seç ve ürün detay sayfasına git
    // 6- Adres, gün ve saat bilgileri doldur
    // 7- Ödeme sayfasına kadar ilerle
    // 8- Anasayfaya dön
    // 9- Çıkış Yap
    @Test
    public void orderProduct(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","123deneme123");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","papatya");
        steps.randomClick("div[class='products__item-img-container ratio-container']");
        steps.sendKeysToElementTest("input[placeholder='Göndereceğiniz mahalleyi, Okul, Hastane vb. seçin']","Akasya Avm");
        steps.clickElement("div[data-value='0']");
        steps.productClick("div[class='product__dates-col']",1);
        steps.clickElement("#productDetailSend > div > div > div:nth-child(2) > div.product__main-info-right.js-set-date-base-campaing-class > div.js-advertisement-available > div.product__dates > div:nth-child(2) > div.product__date-item-hours.js-date-item-hours.is-active > select");
        steps.clickElement("#productDetailSend > div > div > div:nth-child(2) > div.product__main-info-right.js-set-date-base-campaing-class > div.js-advertisement-available > div.product__dates > div:nth-child(2) > div.product__date-item-hours.js-date-item-hours.is-active > select > option:nth-child(4)");
        steps.clickElement("span[class='product__action-button-text']");
        steps.waitSecond(2);
        steps.clickElement("body > main > div.container > div.row > div > div:nth-child(1) > button");
        steps.sendKeysToElementTest("#GroupDeliveryAddressList_0__Address_AddressName","Hasancan İSBECEREN");
        steps.keysEnterToElementTest("#GroupDeliveryAddressList_0__Address_Phone_Phone","5555555555");
        steps.keysEnterToElementTest("#GroupDeliveryAddressList_0__Address_AddressLine","Akasya avm");
        steps.waitSecond(1);
        steps.clickElement("span[class='icon-right-arrow order-next-button__icon']");
        steps.clickElement("button[class='btn btn-lg btn-primary order-next-button order-next-button--before-summary js-submit-form']");
        steps.waitSecond(1);
        steps.clickElement("button[class='btn btn-lg btn-primary order-next-button js-submit-form']");
        steps.waitSecond(1);
        steps.clickElement("a[class='site-logo-responsive__image']");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
