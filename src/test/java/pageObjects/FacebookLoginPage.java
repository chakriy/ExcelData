package pageObjects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static stepDefs.Hooks.*;
public class FacebookLoginPage
{
    @FindBy(xpath = "//input[@id='email']")
    static WebElement emailInput;

    @FindBy(xpath = "//input[@type='password' and @name='pass']")
    static WebElement pwdInput;

    @FindBy(xpath = "//input[@name='firstname']")
    static WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"u_0_p\"]")
    static WebElement surnameInput;

    @FindBy(xpath = "//input[@type='submit']")
    static WebElement loginButton;

    @FindBy(xpath = "//select[@aria-label='Day']")
    static WebElement dayDropDown;

    @FindBy(xpath = "//select[@aria-label='Month']")
    static WebElement monthDropDown;

    @FindBy(xpath = "//select[@aria-label='Year']")
    static WebElement yearDropDown;

    @FindBy(xpath = "//a[contains(text(),'Forgotten')]")
    static WebElement forgottenLink;

    public void accessFacebookLoginPage()
    {

        myDriver.get(cfr.getApplicationUrl());
    }

    public void enterEmailInput(String emailId) {
        emailInput.sendKeys(emailId);

    }

    public void isSeen(String email,String pwd)
    {
        if(emailInput.isDisplayed())
        {
            enterEmailInput(email);
            System.out.println("Email Input is "+email);
        }
        else
        {
            System.out.println("Email Input is not Displayed "+email);
        }
        if(pwdInput.isDisplayed())
        {
            enterPwd(pwd);
            System.out.println("pwd input is "+pwd );
        }
        else
        {
            System.out.println("Password Input is not Displayed");
        }
    }


    public void enterPwd(String S) {
        pwdInput.sendKeys(S);

    }

    public void Click() {
        loginButton.click();
        ScShot.capScrSht(myDriver, "screenShot");
        myDriver.close();

    }
    public void initWebDriver()
    {


             System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            myDriver = new ChromeDriver(options);
            accessFacebookLoginPage();
            PageFactory.initElements(myDriver, FacebookLoginPage.class);


    }
}
