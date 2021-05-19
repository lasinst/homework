package com.bridge.interview.laszlo.service;
import com.bridge.interview.laszlo.dto.Weather;
import org.springframework.web.client.RestTemplate;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class BarbequeService {
    Logger logger = LogManager.getLogger(BarbequeService.class);
    static final String url = "https://api.openweathermap.org/data/2.5/onecall?lat=47.6542&lon=19.2803&exclude=minutely,hourly,daily,alerts&appid=ea305d9a9362485b8bf56c11c1707694&units=metric";

    public Weather getCurrentWeather() {
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(url, Weather.class);
        logger.debug("Response from {}, weather is ", url, weather);
        return weather;
    }

    public BarbequeResponse goodToBarbeque(){
        Weather currentWeather = this.getCurrentWeather();
        BarbequeResponse barbequeResponse = new BarbequeResponse();
        float temp = currentWeather.getCurrent().getTemp();
        float chance = currentWeather.getCurrent().getRain().getChance();
        barbequeResponse.setTemp(temp);
        barbequeResponse.setChance(chance);
        if (temp >= 20 && chance >= .25){
            barbequeResponse.setGoodToBarbeque(true);
            logger.info("GoodToBarbeque is set to true, as temp is {} and chance is {}", temp, chance);
        }
        else {
            barbequeResponse.setGoodToBarbeque(false);
            logger.info("GoodToBarbeque is set to false, as temp is {} and chance is {}", temp, chance);
        }
        return barbequeResponse;

    }
}
