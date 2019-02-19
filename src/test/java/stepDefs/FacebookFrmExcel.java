package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ExcelReadObject;
import pageObjects.FacebookLoginPage;

import java.util.*;

import static stepDefs.Hooks.cfr;
import static stepDefs.Hooks.myDriver;

public class FacebookFrmExcel
{
    ExcelReadObject edo = new ExcelReadObject();
    FacebookLoginPage flp = new FacebookLoginPage();
    HashMap<String,String> hm = new HashMap<String, String>();


    @Given("^U r in facebook login page$")
    public void U_r_in_Facebook_Login_page() throws Exception {
//       flp.initWebDriver();
//        flp.accessFacebookLoginPage();
       // flp.initWebDriver();
        //edo.ExcelReadObject("Book1.xlsx","testdata","User5");
        //edo.ExcelReadObject("testdata","User4");
        //edo.ExcelReadObject("User3");

    }
    @When("^Getting Values From Excel and Feeding to Facebook Login$")
    public void Getting_Values_From_Excel_and_Feeding_to_Facebook_Login() throws Exception
    {
        System.out.println("in When");
        //edo.ExcelReadObject("Book1.xlsx","testdata","User5");
        // edo.ExcelReadObject("testdata","User4");
       // edo.ExcelReadObject("User3");
        edo.ExcelReadObject();
       }


    @Then("^Check Whether Logging in to Facebook And quit$")
    public void Check_Whether_Logging_in_to_Facebook_And_quit()
    {
        System.out.println("in Then");
        myDriver.quit();
    }



}



