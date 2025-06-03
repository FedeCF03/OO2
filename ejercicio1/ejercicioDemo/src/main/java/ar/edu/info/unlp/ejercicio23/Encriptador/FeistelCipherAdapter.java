package ar.edu.info.unlp.ejercicio23.Encriptador;

public class FeistelCipherAdapter implements CifradoAdapter {
    private FeistelCipher feistelCipher;

    public FeistelCipherAdapter(FeistelCipher feistelCipher) {
        this.feistelCipher = feistelCipher;
    }

    @Override
    public String encriptar(String mensaje) {
        return feistelCipher.encode(mensaje);
    }

    @Override
    public String desencriptar(String mensaje) {
        return feistelCipher.encode(mensaje);
    }

}
