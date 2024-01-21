package ro.postuniv.vvta.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ro.postuniv.vvta.steps.serenity.LoginSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/ValidLoginData.csv")
public class LoginValidParametrized {
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    String email, password;

    @Issue("Login into account")
    @Test
    public void loginValid(){
        webdriver.manage().window().maximize();
        loginSteps.goToHomePage();
        loginSteps.clickIcon();
        loginSteps.enterEmail(email);
        loginSteps.enterPassword(password);
        loginSteps.clickLogin();
        loginSteps.verifyMessage("Madalina");
    }
}
