package ar.edu.info.unlp.Ejer21P2;

import java.time.LocalDate;

public class Mamifero extends Animal {

    public Mamifero(String especie, Integer identificador, LocalDate fechaDeNacimiento, Animal padre, Animal madre) {
        super(especie, identificador, fechaDeNacimiento, padre, madre);
    }

}
