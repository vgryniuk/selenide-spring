package com.ua.selenide.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class SelenideConfig {
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browserCapabilities = options;
    }
}
