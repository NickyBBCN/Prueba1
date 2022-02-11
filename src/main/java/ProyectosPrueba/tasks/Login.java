package ProyectosPrueba.tasks;

import ProyectosPrueba.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.tools.ant.taskdefs.email.EmailAddress;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    private String Firstname;
    private String Lastname;
    private String email;
    private String date;

    public Login(String firstname, String lastname, String email, String date) {
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.date = date;
    }

    public static Login onThePage(String firstname, String lastname, String email, String date){
        return Tasks.instrumented(Login.class,firstname,lastname,email,date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LoginPage.JOIN_BUTTON),
            Enter.theValue(Firstname).into(LoginPage.INPUT_FIRST),
            Enter.theValue(Lastname).into(LoginPage.INPUT_LAST),
            Enter.theValue(email).into(LoginPage.INPUT_EMAIL),
            Enter.theValue(date).into(LoginPage.INPUT_DATE),
            Click.on(LoginPage.ENTER_BUTTON));
    }
}
