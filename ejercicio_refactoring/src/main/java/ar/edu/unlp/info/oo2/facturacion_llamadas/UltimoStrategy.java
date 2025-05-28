import java.util.TreeSet;

public class UltimoStrategy implements GeneradorStrategy {

    public UltimoStrategy() {
    }

    @Override
    public String obtenerNumeroLibre(TreeSet<String> lineas) {
        String linea = lineas.last();
        lineas.remove(linea);
        return linea;
    }

}
