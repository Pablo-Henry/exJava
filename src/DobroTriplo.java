import java.util.Scanner;

public class DobroTriplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber o seu dobro e o triplo");
        int num = sc.nextInt();

        int dobro = num * 2;
        int triplo = num * 3;
        System.out.println("Dobro de: " + num + ": " + dobro);
        System.out.println("Triplo de: " + num + ": " + triplo);
    }
}
