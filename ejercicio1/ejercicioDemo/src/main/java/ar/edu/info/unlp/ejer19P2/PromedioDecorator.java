package ar.edu.info.unlp.ejer19P2;

public class PromedioDecorator extends WeatherDataDecorator {
    public PromedioDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public String displayData() {
        Double promedio = weatherData.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        return weatherData.displayData() + "\nTemperatura promedio: " + promedio;
    }

}
