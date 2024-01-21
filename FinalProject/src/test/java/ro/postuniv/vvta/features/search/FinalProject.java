package ro.postuniv.vvta.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ro.postuniv.vvta.steps.serenity.AddToCartSteps;
import ro.postuniv.vvta.steps.serenity.FilterSteps;
import ro.postuniv.vvta.steps.serenity.LoginSteps;
import ro.postuniv.vvta.steps.serenity.SearchSteps;

@RunWith(SerenityRunner.class)
public class FinalProject {

    //aNqnT#bx4bLQc5q

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public SearchSteps searchSteps;

    @Steps
    public FilterSteps filterSteps;

    @Steps
    public AddToCartSteps addToCartSteps;

    @Issue("Search product")
    @Test
    public void searchProduct() {
        webdriver.manage().window().maximize();
        searchSteps.goToHomePage();
        searchSteps.enterSearchText("whiskey");
        searchSteps.startSearch();
        searchSteps.verifySearch("whiskey");
    }

    @Issue("Apply filters to find product")
    @Test
    public void applyFilters(){
        webdriver.manage().window().maximize();
        filterSteps.goToHomePage();
        filterSteps.selectCategory();
        filterSteps.selectSubcategory();
        filterSteps.accesNewPage();
        filterSteps.verifyFilters("Vinattieri");
    }

    @Issue("Add to cart")
    @Test
    public void addToCart() {
        webdriver.manage().window().maximize();
        filterSteps.goToHomePage();
        searchSteps.enterSearchText("whiskey");
        searchSteps.startSearch();
        addToCartSteps.seeProduct();
        addToCartSteps.addToCart();
        addToCartSteps.verifyAdd("succes");
    }
} 