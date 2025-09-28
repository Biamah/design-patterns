package atividades_a_fazer.builder;

public class ProdutoEletronicoBuilder {
    private String nome;
    private String marca;
    private double preco;
    private int quantidadeDisponivel;
    private String descricao;

    public ProdutoEletronicoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoEletronicoBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoEletronicoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoEletronicoBuilder setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
        return this;
    }

    public ProdutoEletronicoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoEletronico build() {
        return ProdutoEletronico.fromBuilder(this);
    }

    protected String getNome() {
        return nome;
    }

    protected String getMarca() {
        return marca;
    }

    protected double getPreco() {
        return preco;
    }

    protected int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    protected String getDescricao() {
        return descricao;
    }
}
