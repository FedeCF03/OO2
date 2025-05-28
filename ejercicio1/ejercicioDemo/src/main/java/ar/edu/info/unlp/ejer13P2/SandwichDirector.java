package ar.edu.info.unlp.ejer13P2;

public class SandwichDirector {
    public Sandwich createSanwichSinTacc() {
        SandwichBuilder sandwichBuilder = new SinTaccBuilder();
        sandwichBuilder.setPan();
        sandwichBuilder.setAderezo();
        sandwichBuilder.setPrincipal();
        sandwichBuilder.setAdicional();
        return sandwichBuilder.build();
    }

}
