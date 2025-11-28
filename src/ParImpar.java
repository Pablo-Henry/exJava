import java.util.Scanner;

public class ParImpar {
        public static void main(String[] args) {

            int num;

            System.out.println("Informe um número:");
            Scanner sc = new Scanner(System.in);

            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " é Par");
            }
            else {
                System.out.println(num + " é impar");
            }
    }
}
