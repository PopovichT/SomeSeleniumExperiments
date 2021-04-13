package com.popovich.simpleyandexscrap;

import com.popovich.simpleyandexscrap.client.SeleniumYandexClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScrapperService {

    private static SeleniumYandexClient seleniumYandexClient = new SeleniumYandexClient();

    public void scrape(final String value) {

    }
}
