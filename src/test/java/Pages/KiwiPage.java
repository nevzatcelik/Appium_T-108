package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "//*[@text='Continue as a guest']")
    public WebElement asAGuest;

    public void ucButtonTiklama(){
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        for (int i=0; i<3; i++){
            action.press(PointOption.point(538,1686)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().
                    perform();
        }
    }
}
