package ar.edu.info.unlp.ejer8P2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejer8p2.Connection;
import ar.edu.info.unlp.ejer8p2.Crc;
import ar.edu.info.unlp.ejer8p2.Crc16_Calculator;
import ar.edu.info.unlp.ejer8p2.Crc32_Calculator;
import ar.edu.info.unlp.ejer8p2.Display;
import ar.edu.info.unlp.ejer8p2.Dispositivo;
import ar.edu.info.unlp.ejer8p2.G4Connection;
import ar.edu.info.unlp.ejer8p2.Ringer;
import ar.edu.info.unlp.ejer8p2.WifiConn;

public class DispositivoTest {

    @Test
    public void testSendConCRC16YWifi() {
        Connection wifi = new WifiConn("WiFi");
        Crc crc16 = new Crc16_Calculator();
        Dispositivo disp = new Dispositivo(wifi, crc16, new Ringer(), new Display());

        String result = disp.send("hola");
        assertTrue(result.contains("WiFi"));
    }

    @Test
    public void testConectarCon4G() {
        Connection conn4G = new G4Connection("4G");
        Dispositivo disp = new Dispositivo(new WifiConn("WiFi"), new Crc16_Calculator(), new Ringer(), new Display());

        String banner = disp.conectarCon(conn4G);
        assertEquals("4G", banner);
    }

    @Test
    public void testCambiarCRC() {
        Dispositivo disp = new Dispositivo(new WifiConn("WiFi"), new Crc16_Calculator(), new Ringer(), new Display());
        disp.configurarCRC(new Crc32_Calculator());
        String result = disp.send("testCRC32");
        assertTrue(result.contains("WiFi"));
    }
}