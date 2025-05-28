package ar.edu.info.unlp.ejer18P2;

public class NombreDecorator extends ImprimirDecorator {

    public NombreDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String imprimir(FileOO2 file) {
        return "Nombre: " + file.getNombre() + "\n" + printer.imprimir(file);
    }

}
