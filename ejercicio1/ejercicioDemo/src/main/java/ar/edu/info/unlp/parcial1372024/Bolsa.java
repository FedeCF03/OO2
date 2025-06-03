package ar.edu.info.unlp.parcial1372024;

import java.util.ArrayList;
import java.util.List;

public class Bolsa implements Item {

    private int capacidad;
    private List<Item> items;
    private int espacioOcupado;

    public Bolsa(int tamaño) {
        this.capacidad = tamaño;
        this.items = new ArrayList<>();
    }

    @Override
    public Item BuscarPorNombre(String nombre) {
        Item item = this.items.stream()
                .filter(i -> i.BuscarPorNombre(nombre) != null)
                .findFirst()
                .orElse(null);
        if (item != null) {
            return item.BuscarPorNombre(nombre);
        }
        return null;

    }

    public boolean agregarItem(Item item) {
        if (item.getTamaño() <= this.capacidad) {
            this.items.add(item);
            this.capacidad -= item.getTamaño();
            return true;
        } else {
            return items.stream()
                    .anyMatch(i -> i.agregarItem(item));
        }

    }

    @Override
    public int getCapacidadDisponible() {
        int total = items.stream()
                .mapToInt(Item::getCapacidadDisponible)
                .sum();
        return total + this.capacidad;
    }

    @Override
    public int EspacioMasGrande() {
        int esp = this.items.stream()
                .mapToInt(Item::EspacioMasGrande)
                .max()
                .orElse(0);
        return Math.max(esp, this.capacidad);
    }

    @Override
    public int getTamaño() {
        return this.espacioOcupado;
    }
}
