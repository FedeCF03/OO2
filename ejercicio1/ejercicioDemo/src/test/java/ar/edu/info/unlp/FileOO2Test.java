package ar.edu.info.unlp;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ar.edu.info.unlp.ejer18P2.ConcretePrinter;
import ar.edu.info.unlp.ejer18P2.FileOO2;
import ar.edu.info.unlp.ejer18P2.NombreDecorator;
import ar.edu.info.unlp.ejer18P2.PermisoDecoretor;
import ar.edu.info.unlp.ejer18P2.Printer;

public class FileOO2Test {
    private FileOO2 archivo;

    @BeforeEach
    public void setUp() {
        this.archivo = new FileOO2("archivo.txt", "TXT", 12, LocalDate.of(2023, 10, 1), LocalDate.of(1222, 2, 12),
                "rw");
    }

    @Test
    public void testNombreExtension() {
        Printer printer = new ConcretePrinter();
        NombreDecorator nombreDecorator = new NombreDecorator(printer);
        PermisoDecoretor permisoDecorator = new PermisoDecoretor(nombreDecorator);

        System.out.println(permisoDecorator.imprimir(archivo));

    }

    @Test
    public void testNombreFechaCreacionExtension() {
    }

    @Test
    public void testNombreTamañoPermisosExtension() {

    }
}