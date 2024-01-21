package ro.postuniv.vvta.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.postuniv.vvta.pages.FilterPage;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class FilterSteps {

    FilterPage filterPage;

    @Step
    public void goToHomePage() {
        filterPage.open();
    }

    @Step
    public void selectCategory() {
        filterPage.choseCategory();
    }

    @Step
    public void selectSubcategory() {
        filterPage.choseSubcategory();
    }

    @Step
    public void accesNewPage() {
        filterPage.accesSubcategoryPage();
    }

    @Step
    public void verifyFilters(String message){
        assertThat(filterPage.firstProduct.getText(), containsString(message));
    }
}
