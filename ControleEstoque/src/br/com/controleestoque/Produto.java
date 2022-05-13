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
}
