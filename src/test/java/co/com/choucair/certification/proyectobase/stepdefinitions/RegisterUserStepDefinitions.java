package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    @Before public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("jesus");
    }

    @Given("^user enters the page$")
    public void userEntersThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }

    @When("^the fields are completed the user is created$")
    public void theFieldsAreCompletedTheUserIsCreated() {
        theActorInTheSpotlight().attemptsTo(RegisterUser.makeinformation());
    }

    @Then("^user sees his name$")
    public void userSeesHisName() {

    }
}
