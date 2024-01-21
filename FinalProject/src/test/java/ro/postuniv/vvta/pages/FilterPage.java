package ro.postuniv.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.finestore.ro/")
public class FilterPage extends PageObject {

    @FindBy(xpath = "/html/body/header/div[3]/div/ul/li[2]/a/span[2]/span[1]")
    private WebElementFacade category;

    @FindBy(xpath = "/html/body/header/div[3]/div/ul/li[2]/ul/li[4]/a/span[2]/span")
    private WebElementFacade subcategory;

    @FindBy(xpath = "/html/body/header/div[3]/div/ul/li[2]/ul/li[4]/ul/li[3]/ul/li/a")
    private WebElementFacade goToSubcategoryPage;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div[1]/div/div[3]/a")
    public WebElementFacade firstProduct;

    public void choseCategory(){
        category.click();
    }

    public void choseSubcategory(){
        subcategory.click();
    }

    public void accesSubcategoryPage(){
        goToSubcategoryPage.click();
    }

}


