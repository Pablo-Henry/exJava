import java.util.Scanner;

public class Conversao {
    static void main(String[] args) {

        double temperatura;

        System.out.println("Informe a temperatura em Celsius:");
        Scanner sc = new Scanner(System.in);

        temperatura = sc.nextFloat();

        double fahrenheit;

        fahrenheit = (temperatura * 1.8) + 32;

        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
    }
}
