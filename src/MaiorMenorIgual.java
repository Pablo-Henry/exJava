import java.util.Scanner;

public class MaiorMenorIgual {
    public static void main(String[] args) {

        int num;

        System.out.println("Digite um Número");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        System.out.println("Número: " + num);
        if (num > 17) {
            System.out.println("O número é maior que 17");
        }
        else if (num < 17) {
            System.out.println("O número é menor que 17");
        }
        else {
            System.out.println("O número é igual a 17");
        }
    }
}
