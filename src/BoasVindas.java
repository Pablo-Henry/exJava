import java.util.Scanner;

public class BoasVindas {
    static void main(String[] args) {
        System.out.println("informe seu nome: ");

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome);
    }
}
