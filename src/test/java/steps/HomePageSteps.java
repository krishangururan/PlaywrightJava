package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePageModule.HomePageActions;
import utils.CommonUtils;

public class HomePageSteps {


    @Given("application is loaded in browser")
    public void checkApplicationLoaded(){
        CommonUtils.openUrl("http://amazon.in");
    }

    @Then("click on the header links")
    public void checkHeaderLinks(){
        new HomePageActions().checkHeaderLinksNavigation();
    }

    @And("close the browser")
    public void closeBrowser(){
        System.out.println(System.getProperty("browser"));
        System.out.println(System.getProperty("Environment"));
        CommonUtils.closeBrowser();

    }
}
