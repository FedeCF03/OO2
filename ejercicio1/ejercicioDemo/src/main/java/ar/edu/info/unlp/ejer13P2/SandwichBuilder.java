package ar.edu.info.unlp.ejer13P2;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public abstract void setPan();

    public abstract void setAderezo();

    public abstract void setPrincipal();

    public abstract void setAdicional();

    public abstract Sandwich build();

}
