package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;



public class US021_TC004 {

        @Test
        public void adminYetkisiyleKullaniciOlusturma(){
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

            adminDasboardPages.signInBtn.click();
            adminDasboardPages.emailTextBox.sendKeys("aysevarli@loyalfriendcare.com"+ Keys.ENTER);
            adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604" + Keys.ENTER);
            adminDasboardPages.adminLogin.click();
            adminDasboardPages.officiaProfile.click();
            adminDasboardPages.sidebar.click();
            adminDasboardPages.menuUsers.click();
            adminDasboardPages.altMenuCreateUser.click();

            Actions actions=new Actions(Driver.getDriver());


            WebElement nameTexbox =Driver.getDriver().findElement(By.xpath("//*[@id='name']"));
            WebElement checkboxuser=Driver.getDriver().findElement(By.xpath("//*[@type='checkbox']"));

            actions.click(nameTexbox)
                    .sendKeys("avatarmavi@hotmail.com")
                    .sendKeys(Keys.TAB)
                    .sendKeys("05556667788")
                    .sendKeys(Keys.TAB).perform();
            actions.click(checkboxuser)
                    .sendKeys(Keys.TAB)
                    .sendKeys("1")
                    .sendKeys(Keys.TAB)
                    .sendKeys("1")
                    .sendKeys(Keys.TAB)
                    .sendKeys("avatarmavi@hotmail.com").perform();
            WebElement buttonSave=Driver.getDriver().findElement(By.xpath("//span[text()='save']"));
            buttonSave.click();

            WebElement succesfulyMesaji = Driver.getDriver().findElement(By.xpath("//div[@class='pgn push-on-sidebar-open pgn-flip']"));

            Assert.assertTrue(succesfulyMesaji.isDisplayed());

            Driver.closeDriver();
            
        }



    }












