package ar.edu.info.unlp.ejer18P2;

public class FechaDeCreacionDecorator extends ImprimirDecorator {

    public FechaDeCreacionDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String imprimir(FileOO2 file) {
        return printer.imprimir(file) + " con fecha de creacion " + file.getFechaCreacion() + "\n";
    }

}
