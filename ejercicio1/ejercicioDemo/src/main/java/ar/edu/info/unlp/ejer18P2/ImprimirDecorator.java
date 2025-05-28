package ar.edu.info.unlp.ejer18P2;

public abstract class ImprimirDecorator implements Printer {
    protected Printer printer;

    public ImprimirDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String imprimir(FileOO2 file) {
        return printer.imprimir(file);
    }

}
