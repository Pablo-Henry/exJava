import java.util.Scanner;

public class ConverteDolar {
    public static void main(String[] args) {
        double dolar = 4.94;
        double real;

        System.out.println("Digite o valor em Dolar que deseja converter:");
        Scanner  sc = new Scanner(System.in);

        real = sc.nextDouble();

        double conversao = dolar * real;

        System.out.println("Valor convertido: " + conversao);
    }
}
