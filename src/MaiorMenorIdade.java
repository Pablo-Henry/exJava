import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MaiorMenorIdade {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME SUA IDADE: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}
