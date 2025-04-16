package ar.edu.info.unlp.ejer6p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaDeinicio;
    private LocalDate fechaDeFin;
    private String puntoDeEncuentro;
    private Double costo;
    private int cupoMínimo;
    private int cupoMáximo;
    private EstadoExcursion estado;
    private List<Usuario> inscriptos;
    private List<Usuario> espera;

    public Excursion(String nombre, LocalDate fechaDeinicio, LocalDate fechaDeFin, String puntoDeEncuentro,
            Double costo,
            int cupoMínimo, int cupoMáximo) {
        this.nombre = nombre;
        this.fechaDeinicio = fechaDeinicio;
        this.fechaDeFin = fechaDeFin;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.costo = costo;
        this.cupoMínimo = cupoMínimo;
        this.cupoMáximo = cupoMáximo;
        this.estado = new EstadoProvisoria(); // Estado inicial
        this.inscriptos = new ArrayList<>();
        this.espera = new ArrayList<>();

    }

    public void inscribir(Usuario unUsuario) {
        this.estado.inscribir(this, unUsuario);
    }

    protected void setEstado(EstadoExcursion estado) {
        this.estado = estado;
    }

    protected void anadirUser(Usuario usuario) {
        inscriptos.add(usuario);
    }

    protected int getCantInscriptos() {
        return inscriptos.size();
    }

    protected int getCupoMáximo() {
        return cupoMáximo;
    }

    protected int getCupoMínimo() {
        return cupoMínimo;
    }

    public String getInformacion() {
        return "nombre: " + this.nombre + "Costo :" + this.costo + "fechaDeInicio : " + this.fechaDeinicio.toString()
                + "fechaDeFin" + this.fechaDeFin.toString() + "punto de encuentro" + this.puntoDeEncuentro;
    }

    protected String getFaltantes() {
        return "Usuarios faltantes" + (this.getCantInscriptos() - this.getCupoMínimo());
    }

    protected String getInscriptosEmail() {
        return "Usuarios inscriptos: " + this.inscriptos.stream().map(u -> u.getEmail()).toString();
    }

    protected void anadirEspera(Usuario usuario) {
        espera.add(usuario);
    }

}
