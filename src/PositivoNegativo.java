import java.util.Scanner;

public class PositivoNegativo {
    static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Número Positivo");

        } else if (num < 0) {
            System.out.println("Número Negativo");

        } else {
            System.out.println("Número igual a 0");
        }
    }
}
