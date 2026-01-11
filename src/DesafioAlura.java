import java.util.Scanner;

public class DesafioAlura {
    static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        Scanner esc2 = new Scanner(System.in);
        Scanner esc3 = new Scanner(System.in);
        int escolha;
        String User = "Aline Souto dos Santos";
        String conta = "Corrente";
        double saldo = 0;

        System.out.println("********************************************************");
        System.out.println("BEM VINDO(A) " + User + "!");
        System.out.println("********************************************************\n");

        System.out.println("DADOS INICIAIS DO CLIENTE: \n1");

        System.out.println("Nome: " + User);
        System.out.println("Tipo de Conta: " + conta);
        System.out.println("Saldo Atual: " + saldo + "\n");


        while( true ) {


            System.out.println("********************************************************\n\n");

            System.out.println("Operações: \n");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair\n");

            System.out.println("Digite a opção desejada: ");
            escolha = esc.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo Atual: " + saldo);

            } else if (escolha == 2) {
                System.out.println("Informe o valor que deseja depositar: ");
                double valor = esc2.nextDouble();
                saldo += valor;
                System.out.println("Saldo Atual: " + saldo);

            } else if (escolha == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valor = esc3.nextDouble();

                if (valor < saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Transação Negada! Saldo Insuficiente.");
                }

                System.out.println("Saldo Atual: " + saldo);
            } else if (escolha == 4) {
                System.out.println("ATÉ LOGO! :)");
                break;
            } else {
                System.out.println("Opção inválida! Escolha uma das opções abaixo: ");
            }


        }
    }
}
