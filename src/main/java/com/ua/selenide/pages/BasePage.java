package com.ua.selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;


public abstract class BasePage<PAGE extends BasePage<PAGE>> {
    private SelenideElement waitOpenPageElement;

    protected BasePage(By waitOpenPageLocator) {
        this.waitOpenPageElement = Selenide.$(waitOpenPageLocator);
    }

    public PAGE waitUntilPageWillOpen() {
        this.waitOpenPageElement.shouldBe(visible);
        return (PAGE) this;
    }
}
