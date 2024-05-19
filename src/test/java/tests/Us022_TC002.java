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

public class Us022_TC002 {



    @Test
    public void bedManegersListesiGörüntüleme() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com" + Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuBedManagers.click();
        adminDasboardPages.altMenuBedManagers.click();

        List<WebElement> bedManagersListesi =Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        Assert.assertTrue(bedManagersListesi.size()>0);










        Driver.closeDriver();
    }
}

