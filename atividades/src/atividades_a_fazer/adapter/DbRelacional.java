package atividades_a_fazer.adapter;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class DbRelacional {
    public List<Map<String, String>> getRawData() {
        List<Map<String, String>> dados = new ArrayList<>();

        dados.add(Map.of("nome", "Teclado"));
        dados.add(Map.of("nome", "Mouse"));
        dados.add(Map.of("nome", "Monitor"));

        return dados;
    }
}