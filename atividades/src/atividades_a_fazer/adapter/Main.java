package atividades_a_fazer.adapter;

public class Main {

    public static void main(String[] args) {
        DbRelacional db = new DbRelacional();
        SistemaArquivos sistemFile = new SistemaArquivos();

        SimpleItemAdapter adapter = new ItemAdapter(db, sistemFile);
        ItemUI.exibir(adapter.getItems());
    }

}