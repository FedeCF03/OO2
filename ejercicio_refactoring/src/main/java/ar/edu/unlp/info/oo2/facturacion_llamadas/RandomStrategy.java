import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class RandomStrategy implements GeneradorStrategy {

    public RandomStrategy() {
    }

    @Override
    public String obtenerNumeroLibre(TreeSet<String> lineas) {
        String linea = new ArrayList<String>(lineas)
                .get(new Random().nextInt(lineas.size()));
        lineas.remove(linea);
        return linea;
    }

}
