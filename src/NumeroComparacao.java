import java.util.Scanner;

public class NumeroComparacao {
    static void main(String[] args) {
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite 2 números: ");
        int num = sc.nextInt(), num2 = sc.nextInt();

        if (num > num2){
               System.out.println("O número: " + num + " é maior que o número: " + num2);
        }
        else if (num < num2){
               System.out.println("O número: " + num + " é menor que o número: " + num2);
        }
        else {
             System.out.println("O número: " + num + " é igual ao número: " + num2);
        }



    }
}
