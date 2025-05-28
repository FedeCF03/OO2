package ar.edu.info.unlp.ejer19P2;

import java.util.ArrayList;
import java.util.List;

public class CelsiusDecorator extends WeatherDataDecorator {
    public CelsiusDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public List<Double> getTemperaturas() {
        List<Double> temperaturas = new ArrayList<>();
        super.getTemperaturas().stream().forEach(temperatura -> {
            double celsius = toCelsius(temperatura);
            temperaturas.add(celsius);
        });
        return temperaturas;
    }

    private double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    @Override
    public double getTemperatura() {
        return toCelsius(super.getTemperatura());
    }

    @Override
    public String displayData() {
        String data = weatherData.displayData();
        data = data.replace("Temperatura F: " + super.getTemperatura(), "Temperatura C: " + getTemperatura());
        return data;
    }

}
