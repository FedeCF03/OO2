package ar.edu.info.unlp.ejer6p2;

public class EstadoProvisoria implements EstadoExcursion {

    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        if (excursion.getCantInscriptos() < excursion.getCupoMáximo()) {
            excursion.anadirUser(usuario);
        }

        if (excursion.getCantInscriptos() >= excursion.getCupoMínimo()) {
            excursion.setEstado(new EstadoDefinitiva());
        }
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return excursion.getInformacion() + " " + excursion.getFaltantes();
    }

}
