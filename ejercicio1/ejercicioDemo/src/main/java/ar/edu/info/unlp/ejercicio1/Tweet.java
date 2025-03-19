package ar.edu.info.unlp.ejercicio1;

public class Tweet {
    private String texto;
    private Tweet original;

    public Tweet(String texto) {
        this.texto = texto;
        original = null;
    }

    public Tweet(Tweet original) {

        this.original = original;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
