package com.ua.selenide.pages;

import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selectors.byCssSelector;
@Component
public class SearchResultsPage extends BasePage<SearchResultsPage> {

    public SearchResultsPage()  {
        super(byCssSelector("div.srp-river"));
    }
}
