package br.com.compras.principal;
import br.com.compras.modelos.Cartao;
import br.com.compras.modelos.Compra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        int limite = ler.nextInt();
        Cartao cartao = new Cartao(limite);

        int continuar = 1;
        while(continuar == 1) {
            System.out.println("Digite a descrição da compra: ");
            String produto = ler.next();
            System.out.println("Digite o valor do produto: ");
            int valor = ler.nextInt();
            Compra compra = new Compra(produto, valor);
            boolean compraRealizada = cartao.comprouOuNao(compra);

            if(compraRealizada) {
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("Para finalizar compra digite 0. Para realizar outra compra digite 1.");
                System.out.println(cartao.getSaldo());

                int continuar2 = ler.nextInt();
                continuar = continuar2;
            } else {
                System.out.println("O valor da compra não pode ser maior que o saldo.");
            }
        }
        for(Compra comprinhas : cartao.getCompras()) {
            System.out.println(comprinhas.toString());
        }
        System.out.println("Saldo final do cartão: " + cartao.getSaldo());
    }
}