package ar.edu.info.unlp.ejer8p2;

public class Crc16_Calculator implements Crc {
    public Crc16_Calculator() {
    }

    @Override
    public long crcFor(String datos) {
        int crc = 0xFFFF;
        for (int j = 0; j < datos.getBytes().length; j++) {
            crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
            crc ^= (datos.getBytes()[j] & 0xff);
            crc ^= ((crc & 0xff) >> 4);
            crc ^= (crc << 12) & 0xffff;
            crc ^= ((crc & 0xFF) << 5) & 0xffff;
        }
        crc &= 0xffff;
        return crc;
    }

}
