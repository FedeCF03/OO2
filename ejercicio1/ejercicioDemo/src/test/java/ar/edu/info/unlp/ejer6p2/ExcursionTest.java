package ar.edu.info.unlp.ejer6p2;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExcursionTest {

    @Test
    public void testInscripcionListaEspera() {
        LocalDate inicio = LocalDate.of(2023, 10, 10);
        LocalDate fin = LocalDate.of(2023, 10, 12);

        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                inicio,
                fin,
                "Puerto Norte",
                100.0,
                1,
                2);

        Usuario u1 = new Usuario("Juan", "Perez", "juan@mail.com");
        Usuario u2 = new Usuario("Maria", "Gomez", "maria@mail.com");
        Usuario u3 = new Usuario("Pedro", "Lopez", "pedro@mail.com");

        excursion.inscribir(u1);
        excursion.inscribir(u2); // Alcanza el cupo máximo
        excursion.inscribir(u3); // Debe ir a lista de espera

        String info = excursion.getInformacion();
        String expected = "Nombre: Dos días en kayak bajando el Paraná\n" +
                "Costo: 100.00\n" +
                "Fechas: 2023-10-10 a 2023-10-12\n" +
                "Punto de encuentro: Puerto Norte";

        assertEquals(expected, info);
    }
}
