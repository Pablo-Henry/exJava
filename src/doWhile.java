import java.util.Scanner;

public class doWhile {
    static void main(String[] args) {

        int soma = 0;
        int contador = 0;

        Scanner num = new Scanner(System.in);
        Scanner esc = new Scanner(System.in);

        String escolha;
        System.out.println("Digite C para continuar ou S para sair");
        escolha = esc.nextLine();


        if ("c".equals(escolha.toLowerCase())) {

            System.out.println("Digite um número");
            int numero = num.nextInt();

            do {
                contador++;
                soma += contador;
            } while (numero > contador);

            System.out.println(soma);

        } else if ("s".equals(escolha)) {
            System.out.println("Operação encerrada!");

        } else {
            System.out.println("Opção inválida");
        }

    }
}

