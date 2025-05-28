package ar.edu.info.unlp.ejer13P2;

public class Sandwich {
    private Pan pan;
    private Aderezo aderezo;
    private Principal principal;
    private Adicional adicional;

    public Double getPrecio() {
        return this.pan.getPrecio() + this.aderezo.getPrecio() + this.principal.getPrecio()
                + this.adicional.getPrecio();
    }

    /**
     * @return Pan return the pan
     */
    public Pan getPan() {
        return pan;
    }

    /**
     * @param pan the pan to set
     */
    public void setPan(Pan pan) {
        this.pan = pan;
    }

    /**
     * @return Aderezo return the aderezo
     */
    public Aderezo getAderezo() {
        return aderezo;
    }

    /**
     * @param aderezo the aderezo to set
     */
    public void setAderezo(Aderezo aderezo) {
        this.aderezo = aderezo;
    }

    /**
     * @return Principal return the principal
     */
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    /**
     * @return Adicional return the adicional
     */
    public Adicional getAdicional() {
        return adicional;
    }

    /**
     * @param adicional the adicional to set
     */
    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }

}
