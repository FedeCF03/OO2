package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuarios.stream().noneMatch(u -> u.getScreenName().equals(usuario.getScreenName()))) {
            this.usuarios.add(usuario);
        }
    }

    public void eliminarUsuario(Usuario usuario) {
        usuario.removeTweet();
        this.usuarios.remove(usuario);
    }

}
