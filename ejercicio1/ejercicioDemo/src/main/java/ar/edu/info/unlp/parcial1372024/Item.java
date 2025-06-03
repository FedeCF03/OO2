package ar.edu.info.unlp.parcial1372024;

public interface Item {
    public int getCapacidadDisponible();

    public int getTamaño();

    public Item BuscarPorNombre(String nombre);

    public boolean agregarItem(Item item);

    public int EspacioMasGrande();
}
