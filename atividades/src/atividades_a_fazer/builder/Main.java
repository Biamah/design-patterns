package atividades_a_fazer.builder;

public class Main {

    public static void main(String[] args) {
        ProdutoEletronico notebook = new ProdutoEletronicoBuilder()
                .setNome("Notebook Gamer")
                .setMarca("Dell")
                .setPreco(6500.00)
                .setQuantidadeDisponivel(20)
                .setDescricao("Notebook Dell")
                .build();

        System.out.println(ProdutoEletronicoFormatter.format(notebook));
    }
}
