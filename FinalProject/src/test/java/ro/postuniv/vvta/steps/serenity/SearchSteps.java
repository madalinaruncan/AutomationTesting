package ro.postuniv.vvta.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.postuniv.vvta.pages.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class SearchSteps {
    SearchPage searchPage;

    @Step
    public void goToHomePage() {
        searchPage.open();
    }

    @Step
    public void enterSearchText(String keyword) {
        searchPage.writeInSearchBar(keyword);
    }

    @Step
    public void startSearch() {
        searchPage.pressSeachButton();
    }

    @Step
    public void verifySearch(String message) {
       assertThat(searchPage.resultMessage.getText(), containsString(message));
    }

}
