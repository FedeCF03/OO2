package ar.edu.info.unlp.ejer8p2;

public class G4Connection implements Connection {

    private String symb;

    public G4Connection(String g) {
        this.symb = g;
    }

    public String transmit(String data, Integer crc) {
        return "hola";
    }

    @Override
    public String sendData(String data, Integer crc) {
        return this.transmit(data, crc);
    }

    @Override
    public String pict() {
        return this.symb;
    }

}
