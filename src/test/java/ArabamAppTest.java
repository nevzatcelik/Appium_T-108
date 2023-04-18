import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ArabamAppTest {

    AndroidDriver<AndroidElement> driver; //android cihazlarin driveri
    final String cihazAdi="PIXEL2";
    final String platformIsmi="Android";
    final String version="10.0";
    final String automation="UiAutomator2";
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazAdi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,version);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automation);
        capabilities.setCapability("appPackage","com.dogan.arabam"); // hangi uygulama uzerinde calismak istedigimizi apk infodan
        capabilities.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity"); // uygulamada hangi sayfayi gormek veya baslatmak istedgimiz
        //genelde Main.Activity ya da Homepage.activity olarak apk info icersinde activities kisminda gorulur
        capabilities.setCapability(MobileCapabilityType.NO_RESET,false);
        // eger false kullanirsak uygulama calistiktan sonra yapilacak adimlari gerceklestirir uygulamayi islem bittikten sonra SIFIRLAR
        // eger true olursa uygulama calistiktan sonra yapilacak adimlari gercceklestirir uygulamayi islem bittikten sonra SIFIRLAMAZ
        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void arabamTest(){

    }
}
