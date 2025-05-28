package ar.edu.info.unlp.ejer18P2;

public class TamanoDecorator extends ImprimirDecorator {

    public TamanoDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String imprimir(FileOO2 file) {
        return printer.imprimir(file) + " de tamaño " + file.getTamano() + "\n";
    }

}
