package certification.ProyectoPrueba.stepdefinitions;


import ProyectosPrueba.questions.Answer;
import ProyectosPrueba.tasks.Login;
import ProyectosPrueba.tasks.OpenUp;
import ProyectosPrueba.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class StepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Nicole wants to learn automation at the academy choucair$")
    public void thanNicoleWantsToLearnAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Nicole").wasAbleTo(OpenUp.thePage(),(Login.OnThePage()));

    }

    @When("^he search for the course(.*) on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(String course) {
        // Write code here that turns the phrase above into concrete actions
    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources(.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        // Write code here that turns the phrase above into concrete actions
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
