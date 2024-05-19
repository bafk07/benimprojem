package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US022_TC001 {


    @Test
    public void sideBardaBedManagersMenuGoruntuleme() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com" + Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuBedManagers.click();


        Assert.assertTrue(adminDasboardPages.altMenuBedManagers.isDisplayed());
        Assert.assertTrue(adminDasboardPages.altMenuCreateBedManagers.isDisplayed());

        Driver.closeDriver();
    }
}
