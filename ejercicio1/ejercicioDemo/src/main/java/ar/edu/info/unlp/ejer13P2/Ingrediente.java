package ar.edu.info.unlp.ejer13P2;

public class Ingrediente {
    private String nombre;
    private Double precio;

    public Ingrediente(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }
}
