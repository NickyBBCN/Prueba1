package certification.ProyectoPrueba.stepdefinitions;


import ProyectosPrueba.tasks.Login;
import ProyectosPrueba.tasks.OpenUp;
import ProyectosPrueba.tasks.Search;
import ProyectosPrueba.userinterface.AcademyData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Let's do the initial automation Utest$")
    public void lets_do_the_initial_automation_utest(List<AcademyData>academyData) throws Exception  {
        OnStage.theActorCalled("Nicole").wasAbleTo(OpenUp.thePage(),(Login.OnThePage()));

    }

    @When("^ we pass the first log filter$")
    public void we_pass_the_first_log_filter( List<AcademyData>academyData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyData.get(0).getDate()));
    }

    @Then("^Tell us about your devices(.*)$")
    public void tell_us_about_your_devices( List<AcademyData>academyData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyData.get(0).getEmail()));
    }


    }


