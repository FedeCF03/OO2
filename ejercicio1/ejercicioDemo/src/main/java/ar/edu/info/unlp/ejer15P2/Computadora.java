package ar.edu.info.unlp.ejer15P2;

public class Computadora {
    private Componente procesador;
    private Componente ram;
    private Componente disco;
    private Componente placaDeVideo;
    private Componente Gabinete;

    public double getConsumo() {
        return this.procesador.getConsumo() + this.ram.getConsumo() + this.disco.getConsumo()

                + this.placaDeVideo.getConsumo() + this.Gabinete.getConsumo();
    }

    public double getPrecio() {
        return 1.21 * (this.procesador.getPrecio() + this.ram.getPrecio() + this.disco.getPrecio()
                + this.placaDeVideo.getPrecio() + this.Gabinete.getPrecio());
    }


    /**
     * @return Componente return the procesador
     */
    public Componente getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(Componente procesador) {
        this.procesador = procesador;
    }

    /**
     * @return Componente return the ram
     */
    public Componente getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(Componente ram) {
        this.ram = ram;
    }

    /**
     * @return Componente return the disco
     */
    public Componente getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(Componente disco) {
        this.disco = disco;
    }

    /**
     * @return Componente return the placaDeVideo
     */
    public Componente getPlacaDeVideo() {
        return placaDeVideo;
    }

    /**
     * @param placaDeVideo the placaDeVideo to set
     */
    public void setPlacaDeVideo(Componente placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    /**
     * @return Componente return the Gabinete
     */
    public Componente getGabinete() {
        return Gabinete;
    }

    /**
     * @param Gabinete the Gabinete to set
     */
    public void setGabinete(Componente Gabinete) {
        this.Gabinete = Gabinete;
    }

}
