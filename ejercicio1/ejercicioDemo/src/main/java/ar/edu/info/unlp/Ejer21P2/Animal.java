package ar.edu.info.unlp.Ejer21P2;

import java.time.LocalDate;

public class Animal {
    private String especie;
    private Integer identificador;
    private LocalDate fechaDeNacimiento;
    private Animal padre;
    private Animal madre;

    public Animal(String especie, Integer identificador, LocalDate fechaDeNacimiento, Animal padre, Animal madre) {
        this.especie = especie;
        this.identificador = identificador;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.padre = padre;
        this.madre = madre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Animal getPadre() {
        return padre;
    }

    public void setPadre(Animal padre) {
        this.padre = padre;
    }

    public Animal getMadre() {
        return madre;
    }

    public void setMadre(Animal madre) {
        this.madre = madre;
    }

    public Animal getAbueloMaterno() {
        return this.madre.getPadre() != null ? this.madre.getPadre() : null;
    }

    public Animal getAbuelaMaterna() {
        return this.madre.getMadre() != null ? this.madre.getMadre() : null;
    }

    public Animal getAbueloPaterno() {
        return this.padre.getPadre() != null ? this.padre.getPadre() : null;
    }

    public Animal getAbuelaPaterna() {
        return this.padre.getMadre() != null ? this.padre.getMadre() : null;
    }

    public boolean tienComoAncestroA(Animal animal) {
        if (this.padre != null) {
            if (this.padre.equals(animal)) {
                return true;
            } else {
                return this.padre.tienComoAncestroA(animal);
            }
        }
        if (this.madre != null) {
            if (this.madre.equals(animal)) {
                return true;
            } else {
                return this.madre.tienComoAncestroA(animal);
            }
        }
        return false;

    }
}
