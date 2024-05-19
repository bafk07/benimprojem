package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getDriver;

public class userHomePage {

    public userHomePage(){
        PageFactory.initElements(getDriver(), this);

    }





    @FindBy(xpath = "(//*[@class='btn_add'])[1]") //Homepage>Sıgn In Button
    public WebElement SıgnInButton;

    @FindBy(xpath = "//*[@name='email']")  //Homepage>Sıgn In>Email Adres Text Box
    public WebElement TextBoxEmail;

    @FindBy(xpath = "//*[@name='password']") //Homepage>Sıgn In>Password Text Box
    public WebElement TextBoxPassword;


    @FindBy(xpath = "//*[@class='btn btn-primary btn-cons m-t-10']")
    public WebElement SignUpButon;



}
