package ar.edu.info.unlp.ejer18P2;

public class ExtensionDecorator extends ImprimirDecorator {

    public ExtensionDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String imprimir(FileOO2 file) {
        return printer.imprimir(file) + " con extension " + file.getExtension() + "\n";
    }

}
