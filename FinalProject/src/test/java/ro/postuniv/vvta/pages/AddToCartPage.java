package ro.postuniv.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddToCartPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div[4]/div/div[3]/a/img")
    private WebElementFacade seeProduct;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[4]/button")
    private WebElementFacade addToCartButton;

    @FindBy(xpath = "/html/body/div[14]/div/div/div[1]/div/div[2]")
    public WebElementFacade confirmationMessage;

    public void seeProduct(){
        seeProduct.click();
    }
    public void addToCart() {
        addToCartButton.click();
    }
}
