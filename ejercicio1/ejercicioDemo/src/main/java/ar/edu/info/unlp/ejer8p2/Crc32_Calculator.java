package ar.edu.info.unlp.ejer8p2;

import java.util.zip.CRC32;

public class Crc32_Calculator implements Crc {

    public Crc32_Calculator() {

    }

    @Override
    public long crcFor(String datos) {
        CRC32 crc = new CRC32();
        crc.update(datos.getBytes());
        long result = crc.getValue();
        return result;
    }

}
