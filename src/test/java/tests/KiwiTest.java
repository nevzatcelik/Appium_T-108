package tests;

import Pages.KiwiPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import utils.Driver;

public class KiwiTest {
    // uygulamanin yuklendigi dogrulanir
// uygulamanin basariyla acildigi dogrulanir
// misafir olarak devam et e tiklanir
// ardinda gelecek olan 3 adimada yesil butona basilarak devam edilir
// Trip type,one way olarak secilir
// kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
// kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
// varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
// gidis tarihi mayis ayinin 21 i olarak secilir ve set date e tiklanir
// search butonuna tiklanir
// en  ucuz ve aktarmasiz filtrelemeleri yapilir
// gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();

    KiwiPage page=new KiwiPage();
    @Test
    public void kiwiTest(){

    }
}
