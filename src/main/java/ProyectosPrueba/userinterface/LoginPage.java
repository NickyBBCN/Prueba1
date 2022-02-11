package ProyectosPrueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {
    public static  final Target JOIN_BUTTON = Target.the("Button that Join Today").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Join Today')]"));
    public static  final Target INPUT_FIRST = Target.the("where do we write the First name").located(By.id("First name"));
    public static  final Target INPUT_LAST = Target.the("where do we write the Last name").located(By.id("Last name"));
    public static  final Target INPUT_EMAIL = Target.the("where do we write the Email address").located(By.id("Email"));
    public static  final Target INPUT_DATE = Target.the("where do we write the Date of Birth").located(By.id("Date of Birth"));
    public static  final Target ENTER_BUTTON = Target.the("button to confirm Next:Location").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
