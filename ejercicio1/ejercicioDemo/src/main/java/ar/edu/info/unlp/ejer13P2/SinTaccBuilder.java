package ar.edu.info.unlp.ejer13P2;

public class SinTaccBuilder extends SandwichBuilder {

    public SinTaccBuilder() {

        super();

    }

    @Override
    public void setPan() {
        sandwich.setPan(new Pan("chipá ", 150.0));
    }

    @Override
    public void setAderezo() {
        sandwich.setAderezo(new Aderezo("salsa criolla", 20.0));
    }

    @Override
    public void setPrincipal() {
        sandwich.setPrincipal(new Principal("milanesa de girgolas", 500.0));
    }

    @Override
    public void setAdicional() {
        sandwich.setAdicional(null);
    }

    @Override
    public Sandwich build() {
        return this.sandwich;
    }

}
