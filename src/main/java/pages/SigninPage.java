package pages;

import com.github.javafaker.Faker;
import core.DriverManager;
import interfaces.TestingType;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Locale;

public class SigninPage extends DriverManager implements TestingType {

    private By txtEmail = By.name("email_create");
    private By btnCriarConta = By.id("SubmitCreate");

    /**
     * Metodo resposavel por valida se a pagina está presente
     *
     * @return true ou false
     *
     * @since 24/11/2020
     */
    public boolean estaPresente() {
        return getWait().until(ExpectedConditions.elementToBeClickable(txtEmail)).isEnabled();
    }


    /**
     *  Metodo resposavel por criar uma conta
     *
     * @since 24/11/2020
     */
    public void criaConta(){
        Faker faker = new Faker();

        getDriver().findElement(txtEmail).sendKeys(faker.name().firstName()+"@etec.gov.br".replace(" ",""));
        getDriver().findElement(btnCriarConta).click();

    }


}
