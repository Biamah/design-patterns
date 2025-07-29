package atividades_a_fazer.adapter;

import atividades_resolvidas.adapter.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ItemAdapter implements SimpleItemAdapter {
    private final DbRelacional dbSource;
    private final SistemaArquivos fileSource;

    public ItemAdapter(DbRelacional dbSource, SistemaArquivos fileSource) {
        this.dbSource = dbSource;
        this.fileSource = fileSource;
    }

    @Override
    public  List<Item> getItems() {
        List<Item> items = new ArrayList<>();

        // converte os dados do banco
        for (Map<String, String> registro : dbSource.getRawData()) {
            String nome = registro.get("nome");
            String item = registro.get("item");
            items.add(new Item(nome, item));
        }

        // converte os dados do arquivo
        for (Properties props : fileSource.getRawData()) {
            String nome = props.getProperty("nome");
            String item = props.getProperty("item");
            items.add(new Item(nome, item));
        }

        return items;
    }
}