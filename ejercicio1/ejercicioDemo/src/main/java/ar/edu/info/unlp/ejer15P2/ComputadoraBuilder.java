package ar.edu.info.unlp.ejer15P2;

public interface ComputadoraBuilder {
    public double calcularPresupuesto();

    public void setProcesador(Catalogo catalogo);

    public void setRam(Catalogo catalogo);

    public void setDisco(Catalogo catalogo);

    public void setPlacaDeVideo(Catalogo catalogo);

    public void setGabinete(Catalogo catalogo);

}
