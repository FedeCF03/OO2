package ar.edu.info.unlp.ejer18P2;

public class ConcretePrinter implements Printer {

    public ConcretePrinter() {
    }

    @Override
    public String imprimir(FileOO2 file) {
        return "me ejecuto";
    }

}
