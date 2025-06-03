package ar.edu.info.unlp.ejercicio23.Encriptador;

public class RC4Adapter implements CifradoAdapter {
    private RC4 rc4;
    private String clave;

    public RC4Adapter(String clave) {
        this.rc4 = new RC4();
        this.clave = clave;
    }

    @Override
    public String encriptar(String mensaje) {
        return rc4.encriptar(mensaje, clave);
    }

    @Override
    public String desencriptar(String mensaje) {
        return rc4.desencriptar(mensaje, clave);
    }

}
