package ro.postuniv.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.finestore.ro/")
public class SearchPage extends PageObject {

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div[4]/div/input")
    private WebElementFacade searchBar;

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div[4]/div/div[1]/i")
    private WebElementFacade searchButton;

    @FindBy(id = "fs_search_result_input")
    public WebElementFacade resultMessage;

    public void writeInSearchBar(String keyword) {
        searchBar.type(keyword);
    }

    public void pressSeachButton() {
        searchButton.click();
    }


}
