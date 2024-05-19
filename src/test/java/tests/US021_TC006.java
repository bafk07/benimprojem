package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US021_TC006 {

    @Test
    public void olusturulanKullaniciBilgileriDüzenlemeveSilme() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com" + Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuUsers.click();
        adminDasboardPages.altMenuUsers.click();
        adminDasboardPages.butonSearch.click();
        adminDasboardPages.butonSearch.sendKeys("avatarmavi");


        String expectedText = "avatarmavi";


        List<WebElement> kullaniciListesi = Driver.getDriver().findElements(By.xpath("//td[@class='dataTables_empty']"));

        for (WebElement element : kullaniciListesi) {
            String actualText = element.getText();
            Assert.assertEquals(actualText, expectedText);
        }
        System.out.println("Olusturulan kullanıcı listede görünmüyor,silme ve düzenleme yapılamadı");
    }
}































