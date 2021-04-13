package com.popovich.simpleyandexscrap.client;

import com.popovich.simpleyandexscrap.configuration.SeleniumConfiguration;
import org.openqa.selenium.By;

public class SeleniumYandexClient {

    private SeleniumConfiguration seleniumConfiguration;
    private static final String url = "https://yandex.ru/";

    public SeleniumYandexClient(){
        seleniumConfiguration = new SeleniumConfiguration();
        seleniumConfiguration.getWebDriver();
    }

    public void closeWindow() {this.seleniumConfiguration.getWebDriver().close();}

    public String getTitle() {
        return this.seleniumConfiguration.getWebDriver().getTitle();
    }

    public String getPageNameText() {
        return seleniumConfiguration.getWebDriver().findElement(By.id("page-name")).getText();
    }
}
