import java.util.Scanner;

public class ProdutoQuantidade {
    public static void main(String[] args) {

        double preco;
        int quantidade;

        System.out.println("Informe o preço do produto:");
        Scanner sp = new Scanner(System.in);
        preco = sp.nextFloat();

        System.out.println("Informe a quantidade:");
        Scanner sq = new Scanner(System.in);
        quantidade = sq.nextInt();

        double total = preco * quantidade;

        System.out.println("Total: " + total);

    }
}
