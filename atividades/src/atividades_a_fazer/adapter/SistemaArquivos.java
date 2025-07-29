package atividades_a_fazer.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SistemaArquivos {
    public List<Properties> getRawData() {
        List<Properties> dados = new ArrayList<>();

        Properties p1 = new Properties();
        p1.setProperty("nome", "Caderno");

        Properties p2 = new Properties();
        p2.setProperty("nome", "Caneta");

        dados.add(p1);
        dados.add(p2);

        return dados;
    }
}