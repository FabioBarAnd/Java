package br.com.compras.modelos;

public class Compra {
    private String produto;
    private int valor;

    public Compra(String produto, int valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getProduto() {
        return produto;
    }


    @Override
    public String toString() {
        return "Produto: " + produto + " + Valor: " + valor;
    }
}
