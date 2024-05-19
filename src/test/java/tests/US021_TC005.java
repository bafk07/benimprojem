package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.userHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US021_TC005 {
    @Test
    public void olusturulanKullaniciIleGiris(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));


        userHomePage userHomePages=new userHomePage();

        userHomePages.SıgnInButton.click();


        userHomePages.TextBoxEmail.sendKeys("avatarmavi@hotmail.com");


        userHomePages.TextBoxPassword.sendKeys("1");


        userHomePages.SignUpButon.click();


        WebElement userNameButton = Driver.getDriver().findElement(By.xpath("//*[text()=' avatar mavi']"));
        Assert.assertTrue(userNameButton.isDisplayed());








    }

}
