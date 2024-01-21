package ro.postuniv.vvta.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import ro.postuniv.vvta.pages.LoginPage;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class LoginSteps {

    private static WebDriver webDriver;
    LoginPage loginPage;

    @Step
    public void goToHomePage() {
        loginPage.open();
    }

    @Step
    public void clickIcon(){
        loginPage.clickAccountIcon();
    }

    @Step
    public void enterEmail(String email){
        loginPage.enterEmail(email);
    }

    @Step
    public void enterPassword(String password){
        loginPage.enterPassword(password);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void verifyMessage(String message){
        assertThat(loginPage.helloText.getText(), containsString(message));
    }


}
