package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US021_TC003 {
    @Test

    public void kullaniciListesiGörüntüleme(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuUsers.click();
        adminDasboardPages.altMenuUsers.click();


        WebElement usersayfa1=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));
        Assert.assertTrue(usersayfa1.isDisplayed());
        WebElement butonNext=Driver.getDriver().findElement(By.xpath("//*[@rel='next']"));
        butonNext.click();

        WebElement usersayfa2=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));
        Assert.assertTrue(usersayfa2.isDisplayed());
        WebElement butonNextSayfa2=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=3']"));
        butonNextSayfa2.click();

        WebElement usersayfa3=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));
        Assert.assertTrue(usersayfa3.isDisplayed());
        WebElement butonNextSayfa3=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=4']"));
        butonNextSayfa3.click();


        WebElement usersayfa4=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));
        Assert.assertTrue(usersayfa4.isDisplayed());
        WebElement butonNextSayfa4=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=5']"));
        butonNextSayfa4.click();

        WebElement usersayfa5=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));
        Assert.assertTrue(usersayfa5.isDisplayed());
        WebElement butonNextSayfa5=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=6']"));
        butonNextSayfa5.click();

        System.out.println("------!!!!!ALTINCI SAYFADA HATA VERİYOR BUG VAR RAPOR EDİLMESİ LAZIM---!!!----");
        System.out.println("--------KULLANICILAR GÖZÜKMÜYOR-------");



    }




}
