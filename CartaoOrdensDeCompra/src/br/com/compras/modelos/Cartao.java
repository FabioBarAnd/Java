package br.com.compras.modelos;
import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private int limite;
    private int saldo = limite;
    private List<Compra> compras;

    public Cartao(int limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean comprouOuNao(Compra compra) {
        if(compra.getValor() <= this.saldo) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
