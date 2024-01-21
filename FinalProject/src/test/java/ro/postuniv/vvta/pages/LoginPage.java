package ro.postuniv.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.finestore.ro/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div[6]/div[3]/span/i[1]")
    private WebElementFacade loginIcon;

    @FindBy(name = "email")
    private WebElementFacade emailBar;

    @FindBy(name = "password")
    private WebElementFacade passwordBar;

    @FindBy(id = "login_button")
    private WebElementFacade loginButton;

    @FindBy(tagName = "h2")
    public WebElementFacade helloText;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/form/p[1]/text()")
   public WebElementFacade errorMessage;

    public void clickAccountIcon(){
        loginIcon.click();
    }

    public void enterEmail(String email){
        emailBar.type(email);
    }

    public void enterPassword(String password){
        passwordBar.type(password);
    }

    public void clickLogin(){
        loginButton.click();
    }
}
