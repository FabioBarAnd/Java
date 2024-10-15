import java.util.Scanner;

public class Main {
    public static void telaInicial(int saldo) {
        String dadosBancarios = """
                                ***********************
                                Dados iniciais do cliente:
                                                                                
                                Nome: Fabio
                                Tipo conta: Corrente
                                Seu saldo: R$ %d,00
                                ***********************                                                  
                                """.formatted(saldo);
        System.out.println(dadosBancarios);
    }

    public static int operacoes() {
        Scanner leitura = new Scanner(System.in);
        String operacoes = """
                Operações
                                    
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        int operacao = leitura.nextInt();
        System.out.println(operacoes);
        return operacao;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int saldoInicial = 2500;
        int saldoAtualizado = 0;
        int opcao = 0;

        while (opcao != 1) {
            telaInicial(saldoInicial);
            operacoes();
            int operacao = operacoes();
            switch (operacao) {
                case (1): {
                    telaInicial(saldoInicial);
                }
                case (2): {
                    System.out.println("Informe o valor a receber: ");
                    int valorAhReceber = leitura.nextInt();
                    saldoAtualizado = valorAhReceber + saldoInicial;
                    telaInicial(saldoAtualizado);
                }
                case (3): {
                    System.out.println("Informe o valor a transferir: ");
                    int valorAhTransferir = leitura.nextInt();
                    saldoAtualizado = saldoAtualizado - valorAhTransferir;
                    telaInicial(saldoAtualizado);
                }
                case (4): {
                    opcao = 1;
                }

                default: {
                    System.out.println("Opção errada. Digite uma opção válida.");
                }
            }
        }
    }
}
