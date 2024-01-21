package ro.postuniv.vvta.features.search;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ro.postuniv.vvta.steps.serenity.LoginSteps;

import static org.junit.Assert.assertThat;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/InvalidLoginData.csv")
public class LoginInvalidParametrized {
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    String email, password;

    @Issue("Try login")
    @Test
    public void loginInvalid(){
        webdriver.manage().window().maximize();
        loginSteps.goToHomePage();
        loginSteps.clickIcon();
        loginSteps.enterEmail(email);
        loginSteps.enterPassword(password);
        loginSteps.clickLogin();
        assertThat(webdriver.getCurrentUrl(), Matchers.not("https://www.finestore.ro/account"));
    }
}
