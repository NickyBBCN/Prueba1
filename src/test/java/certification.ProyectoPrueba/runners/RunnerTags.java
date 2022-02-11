package certification.ProyectoPrueba.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/ProyectosPrueba.feature",
        tags="@stories",
        glue ="certification.ProyectoPrueba.stepdefinitions",
        snippets =SnippetType.CAMELCASE)

public class RunnerTags {
}
