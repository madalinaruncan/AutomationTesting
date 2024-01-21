package ro.postuniv.vvta.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.postuniv.vvta.pages.AddToCartPage;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class AddToCartSteps {

    AddToCartPage addToCartPage;

    @Step
    public void seeProduct(){
        addToCartPage.seeProduct();
    }

    @Step
    public void addToCart(){
        addToCartPage.addToCart();
    }

    @Step
    public void verifyAdd(String message){
        assertThat(addToCartPage.confirmationMessage.getText(), containsString(message));

    }
}
