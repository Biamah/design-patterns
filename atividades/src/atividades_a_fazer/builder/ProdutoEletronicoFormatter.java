package atividades_a_fazer.builder;

public class ProdutoEletronicoFormatter {
    private ProdutoEletronicoFormatter() {
    }

    public static String format(ProdutoEletronico produto) {
        return String.format("Produto: %s\nMarca: %s\nPreço: R$ %.2f\nQuantidade Disponível: %d\nDescrição: %s",
                produto.getNome(),
                produto.getMarca(),
                produto.getPreco(),
                produto.getQuantidadeDisponivel(),
                produto.getDescricao());
    }
}
