package ar.edu.info.unlp.ejer14P2;

import java.util.ArrayList;
import java.util.List;

public class CompoundPrenda {
    private List<Prenda> prendas = new ArrayList<>();

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public double valor() {

        return this.prendas.stream().mapToDouble(Prenda::valor).sum();

    }

    public double valorPrendario() {

        return this.valor() * 0.5;
    }
}
