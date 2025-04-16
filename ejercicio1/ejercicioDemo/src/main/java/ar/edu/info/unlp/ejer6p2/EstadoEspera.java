package ar.edu.info.unlp.ejer6p2;

public class EstadoEspera implements EstadoExcursion {

    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        if (excursion.getCantInscriptos() < excursion.getCupoMáximo()) {
            excursion.anadirUser(usuario);
        } else {
            excursion.anadirEspera(usuario);
        }
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return excursion.getInformacion();
    }

}
