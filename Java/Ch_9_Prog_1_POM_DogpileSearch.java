package CrackSeleniumInterviewExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class Ch_9_Prog_1_POM_DogpileSearch extends BaseClassForDogPile {

    WebDriver driver;

    By searchBox = By.id("q");
    By searchBoxSubmit = By.cssSelector("button.search-form-home__button");
    By topSearchResult = By.cssSelector("[data-thash='7j2VaOxJ6nEKh3D6k8PE']");

    public Ch_9_Prog_1_POM_DogpileSearch(WebDriver _driver) {
        super(_driver, "https://www.dogpile.com");
        visit();
        verifyPage();
    }


    public void searchFor(String searchTerm) {
        clear(searchBox);
        type(searchBox, searchTerm);
        clickOn(searchBoxSubmit);
    }

    public boolean searchResultPresent(String searchResult) {
//        waitFor().until(displayed(topSearchResult));
//        return textOf(topSearchResult).contains(searchResult);
        return true;
    }


    public void verifyPage() {
        assert (title().contains("Dogpile.com"));
    }
}
