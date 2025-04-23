package ar.edu.info.unlp.ejer8p2;

public class WifiConn implements Connection {
    private String pict;

    public WifiConn(String pict) {
        this.pict = pict;
    }

    @Override
    public String sendData(String data, Integer crc) {

        return "Enviando datos por WiFi: " + data + " con CRC: " + crc;
    }

    @Override
    public String pict() {
        return pict;
    }

}
