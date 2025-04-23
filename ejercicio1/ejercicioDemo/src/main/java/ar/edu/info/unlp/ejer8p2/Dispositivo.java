package ar.edu.info.unlp.ejer8p2;

public class Dispositivo {
    private Connection connection;
    private Crc crc;
    private Ringer ringer;
    private Display display;

    public Dispositivo(Connection conn, Crc calc, Ringer ringer, Display display) {
        this.connection = conn;
        this.crc = calc;
        this.ringer = ringer;
        this.display = display;
    }

    public String send(String data) {
        long crc_calculadora = crc.crcFor(data);
        return connection.sendData(data, ((int) crc_calculadora));
    }

    public String conectarCon(Connection nuevaConn) {
        this.connection = nuevaConn;
        String img = nuevaConn.pict();
        ringer.ring();
        return display.showBanner(img);
    }

    public void configurarCRC(Crc nuevoCalc) {
        this.crc = nuevoCalc;
    }
}
