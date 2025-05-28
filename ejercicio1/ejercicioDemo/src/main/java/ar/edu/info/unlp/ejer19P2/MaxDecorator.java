package ar.edu.info.unlp.ejer19P2;

public class MaxDecorator extends WeatherDataDecorator {
    public MaxDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public String displayData() {
        Double max = weatherData.getTemperaturas().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);

        return weatherData.displayData() + "\nMax: " + max;
    }

}
