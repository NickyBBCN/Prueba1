package ProyectosPrueba.tasks;

import ProyectosPrueba.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON),
            Enter.theValue("IngresaTuUsuario").into(LoginPage.INPUT_USER),
            Enter.theValue("IngresaTuContraseña").into(LoginPage.INPUT_PASSWORD),
            Click.on(LoginPage.ENTER_BUTTON));
    }
}
