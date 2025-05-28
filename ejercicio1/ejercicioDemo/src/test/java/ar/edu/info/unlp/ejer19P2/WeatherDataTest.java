package ar.edu.info.unlp.ejer19P2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {

    private WeatherData weatherData;

    @BeforeEach
    public void setUp() {
        HomeWeatherStation homeWeatherStation = new HomeWeatherStation(212.0, 1013.25, 200.0);
        homeWeatherStation.anadirTemperatura(214.0);
        homeWeatherStation.anadirTemperatura(211.0);
        homeWeatherStation.anadirTemperatura(210.0);

        weatherData = homeWeatherStation;

    }

    @Test
    public void testGetTemperatura() {
        double temperatura = weatherData.getTemperatura();
        System.out.println(weatherData.displayData());
    }

    @Test
    public void testGetTemperaturaCelsius() {
        CelsiusDecorator celsiusDecorator = new CelsiusDecorator(weatherData);
        double temperatura = celsiusDecorator.getTemperatura();
        System.out.println(celsiusDecorator.displayData());
    }

    @Test
    public void testGetTemperaturaCelsiusYPromedio() {
        CelsiusDecorator celsiusDecorator = new CelsiusDecorator(weatherData);
        PromedioDecorator promedioDecorator = new PromedioDecorator(celsiusDecorator);
        System.out.println(promedioDecorator.displayData());
    }

}
