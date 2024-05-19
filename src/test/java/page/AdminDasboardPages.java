package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class AdminDasboardPages{
    public AdminDasboardPages() {
    PageFactory.initElements(getDriver(), this);
}



        @FindBy(id = "email")
        public WebElement emailTextBox;

        @FindBy(xpath = "(//*[@*='dropdown-item'])[2]")
        public WebElement editProfile;

        @FindBy(xpath = "//*[text()='ayşe varlı']")
        public WebElement userName;

        @FindBy(id = "password")
        public WebElement passwordTextBox;

        @FindBy(xpath = "(//*[@class='btn_add'])[1]")
        public WebElement signInBtn;

        @FindBy(xpath = "(//*[@class='btn_add'])[1]")
        public WebElement adminLogin;

        @FindBy(xpath = "//*[@class='thumbnail-wrapper d32 border-5  inline']")
        public WebElement officiaProfile;

        @FindBy(xpath = "(//*[@*='dropdown-item'])[1]")
        public WebElement settingsBtn;

        @FindBy(xpath = "//*[text()='Logout']")
        public WebElement logout;

        @FindBy(xpath = "//*[text()='404']")
        public WebElement mainSorry;



        @FindBy(xpath = "//div[@class='sidebar-header']")
        public WebElement sidebar;


        @FindBy(xpath = "(//*[text()='Users'])[1]")
        public WebElement menuUsers;


        @FindBy(xpath = "(//*[text()='Users'])[2]")
        public WebElement altMenuUsers;

        @FindBy(xpath = "//*[text()='Create User']")
        public WebElement altMenuCreateUser;

        @FindBy(xpath = "//*[@id='tableWithSearch']")
        public  WebElement tabloUsers1;














    }










