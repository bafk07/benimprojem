package tests;


import org.openqa.selenium.Keys;
import org.testng.Assert;

import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;


public class US021_TC002 {

@Test
    public void sideBardaUsersMenuGoruntuleme(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuUsers.click();

        Assert.assertTrue(adminDasboardPages.altMenuUsers.isDisplayed());
        Assert.assertTrue(adminDasboardPages.altMenuCreateUser.isDisplayed());

        Driver.closeDriver();




    }



        }


