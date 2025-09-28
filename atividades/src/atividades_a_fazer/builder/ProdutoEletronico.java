package atividades_a_fazer.builder;

public class ProdutoEletronico {
    private final String nome;
    private final String marca;
    private final double preco;
    private final int quantidadeDisponivel;
    private final String descricao;

    private ProdutoEletronico(ProdutoEletronicoBuilder builder) {
        this.nome = builder.getNome();
        this.marca = builder.getMarca();
        this.preco = builder.getPreco();
        this.quantidadeDisponivel = builder.getQuantidadeDisponivel();
        this.descricao = builder.getDescricao();
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public static ProdutoEletronico fromBuilder(ProdutoEletronicoBuilder builder) {
        return new ProdutoEletronico(builder);
    }
}
