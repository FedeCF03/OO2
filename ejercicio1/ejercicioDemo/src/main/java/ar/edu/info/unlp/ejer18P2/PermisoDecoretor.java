package ar.edu.info.unlp.ejer18P2;

public class PermisoDecoretor extends ImprimirDecorator {

    public PermisoDecoretor(Printer printer) {
        super(printer);
    }

    @Override
    public String imprimir(FileOO2 file) {
        return printer.imprimir(file) + " con permiso " + file.getPermisos() + "\n";
    }

}
