package br.com.controleestoque;

public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;

    public Produto(final String codigo, final String nome, final int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void addQuantidade(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public void subQuantidade(int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }
}
