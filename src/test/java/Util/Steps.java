package Util;

import Util.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Steps extends Methods {
    public void clickElement(String key){
        WebElement element = findElement(key);
        clickToElement(element);
    }
    public void randomClick(String key){
        List<WebElement> elements = findElements(key);
        clickToElement(elements.get(randomInt()));
    }
    public void productClick(String key,Integer number){
        List<WebElement> elements = findElements(key);
        clickToElement(elements.get(number));
    }
    public void sendKeysToElementTest(String key, String text){
        WebElement element = findElement(key);
        sendKeysToElement(element,text);
    }
    public void keysEnterToElementTest(String key,String text){
        WebElement element = findElement(key);
        keysEnterToElement(element,text);
    }
    public void waitSecond(int second){
        waitByMilliSeconds(second * 1000);
    }
    public void getTextControlTest(String key, String text){
        WebElement element = findElement(key);
        getTextControl(element,text);
    }
    public void saveText(String key){
        WebElement element = findElement(key);
        saveStaticString(element);
    }
    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.click();
    }
}
