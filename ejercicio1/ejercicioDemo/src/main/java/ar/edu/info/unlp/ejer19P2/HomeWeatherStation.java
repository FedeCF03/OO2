package ar.edu.info.unlp.ejer19P2;

import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturasSensadas;

    public HomeWeatherStation(double temperatura, double presion, double radiacionSolar) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
        this.temperaturasSensadas = new java.util.ArrayList<>();
    }

    @Override
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public double getPresion() {
        return presion;
    }

    @Override
    public double getRadiacionSolar() {
        return radiacionSolar;
    }

    @Override
    public String displayData() {
        return "Temperatura F: " + temperatura + ", Presion: " + presion + ", Radiacion Solar: "
                + radiacionSolar;
    }

    @Override
    public List<Double> getTemperaturas() {
        return temperaturasSensadas;
    }

    public void anadirTemperatura(double temperatura) {
        this.temperaturasSensadas.add(temperatura);
    }

}
