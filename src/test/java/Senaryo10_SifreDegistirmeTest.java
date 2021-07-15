import org.junit.jupiter.api.Test;

public class Senaryo10_SifreDegistirmeTest extends BaseTest{
    Steps steps =new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Hesabım>Şifre Değiştir'e git
    // 5- Şifreyi güncelle
    // 6- Şifrenin güncellendiğini kontrol et*******
    // 7- Çıkış Yap
    @Test
    public void changePassword(){
        steps.sendKeysToElementTest("input[id='EmailLogin']","xmyle@outlook.com");
        steps.sendKeysToElementTest("input[id='Password']","1234512345");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickByXpath("//span[text()='Hesabım']");
        steps.clickByXpath("//span[text()='Şifre Değiştir']");
        steps.sendKeysToElementTest("input[id='OldPassword']", "1234512345");
        steps.sendKeysToElementTest("input[id='NewPassword']", "123deneme123");
        steps.sendKeysToElementTest("input[id='NewPasswordConfirm']", "123deneme123");
        steps.clickByXpath("//button[text()='Güncelle']");
        steps.waitSecond(1);
        //steps.getTextControlTest("body > main > div > div > div.account__right > div > form > div.alert.alert-success > p","Şifreniz başarıyla değiştirilmiştir.");
        steps.clickElement("a[class='user-menu__log-out']");

    }
}
