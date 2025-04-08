package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonExporter implements exporter {
    @Override
    public String exportar(List<Socio> socios) {

        JSONArray jsonArray = new JSONArray();
        socios.stream().forEach(socio -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("nombre", socio.getNombre());
            jsonObject.put("email", socio.getEmail());
            jsonObject.put("legajo", socio.getLegajo());
            jsonArray.add(jsonObject);
        });
        return jsonArray.toJSONString();

    }

}
