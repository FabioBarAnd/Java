import ZeroComoDivisorException.ZeroComoDivisorException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = leitura.nextInt();

        try {
            int divisao = n1 / n2;
            if((n1 == 0) || (n2 == 0)){
                throw new ZeroComoDivisorException("Um dos divisores é igual a zero");
            }
            System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro" + e.getMessage());
        }
    }
}
