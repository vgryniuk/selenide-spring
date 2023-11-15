package com.ua.selenide.pages;

import com.codeborne.selenide.Selenide;
import com.ua.selenide.config.SelenideConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HomePage extends BasePage<HomePage>{
    @Autowired
    private SelenideConfig selenideConfig;
    @Autowired
    private SearchResultsPage searchResultsPage;
    public HomePage()  {
        super(byId("#gh-l-h1"));
    }

    public HomePage open() {
        selenideConfig.setup();
        Selenide.open("https://www.ebay.com/");
        return this;
    }

    public SearchResultsPage search(String query) {
        $(".ui-autocomplete-input").setValue(query);
        $(".gh-spr").click();
        return searchResultsPage.waitUntilPageWillOpen();
    }
}
