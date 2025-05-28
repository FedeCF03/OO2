import java.util.TreeSet;

public class PrimeroStrategy implements GeneradorStrategy {

    public PrimeroStrategy() {
    }

    @Override
    public String obtenerNumeroLibre(TreeSet<String> lineas) {
        String linea = lineas.first();
        lineas.remove(linea);
        return linea;
    }

}
