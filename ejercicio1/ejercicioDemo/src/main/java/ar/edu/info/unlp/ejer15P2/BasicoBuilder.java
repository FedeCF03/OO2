package ar.edu.info.unlp.ejer15P2;

public class BasicoBuilder implements ComputadoraBuilder {
    private Computadora computadora;

    public BasicoBuilder() {
        this.computadora = new Computadora();
    }

    @Override
    public double calcularPresupuesto() {
        return computadora.getProcesador().getPrecio() + computadora.getRam().getPrecio()
                + computadora.getDisco().getPrecio() + computadora.getGabinete().getPrecio();
    }

    @Override
    public void setProcesador(Catalogo catalogo) {
        this.computadora.setProcesador(catalogo.getComponentes("Procesador Básico"));
    }

    @Override
    public void setRam(Catalogo catalogo) {
        this.computadora.setRam(catalogo.getComponentes("8gb basica"));
    }

    @Override
    public void setDisco(Catalogo catalogo) {
        this.computadora.setDisco(catalogo.getComponentes("disco 500gb"));
    }

    @Override
    public void setPlacaDeVideo(Catalogo catalogo) {
        this.computadora.setPlacaDeVideo(null); // que pongo cuando no posee? null esta bien?
    }

    @Override
    public void setGabinete(Catalogo catalogo) {
        this.computadora.setGabinete(catalogo.getComponentes("Gabinete Basico"));
    }

}
