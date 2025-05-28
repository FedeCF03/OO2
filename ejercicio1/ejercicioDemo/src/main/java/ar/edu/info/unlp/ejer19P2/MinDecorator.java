package ar.edu.info.unlp.ejer19P2;

public class MinDecorator extends WeatherDataDecorator {
    public MinDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public String displayData() {
        Double min = weatherData.getTemperaturas().stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
        return weatherData.displayData() + "\nTemperatura minima: " + min;
    }

}
