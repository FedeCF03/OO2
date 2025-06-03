package ar.edu.info.unlp.parcial1372024;

public class ItemSimple implements Item {
    private String nombre;
    private int espacioOcupado;

    public ItemSimple(String nombre, int tamaño) {
        this.nombre = nombre;
        this.espacioOcupado = tamaño;
    }

    @Override
    public Item BuscarPorNombre(String nombre) {
        return this.nombre.equals(nombre) ? this : null;
    }

    @Override
    public int getCapacidadDisponible() {
        return 0;
    }

    @Override
    public int getTamaño() {
        return this.espacioOcupado;
    }

    @Override
    public boolean agregarItem(Item item) {
        // Un ItemSimple no puede contener otros items, por lo tanto siempre retorna
        // false
        return false;
    }

    @Override
    public int EspacioMasGrande() {
        // Un ItemSimple no puede contener otros items, por lo tanto retorna su tamaño
        return this.espacioOcupado;
    }

}
