import java.util.Scanner;

public class VetorInteiro {
    public static void main(String[] args) {
        int[] vetorInt =  new int[5];
        int valor;
        int contador = 0;
        int soma = 0;
        double media;
        int menor = vetorInt[contador];
        int maior = vetorInt[contador];
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("informe 5 valores: ");
            valor = sc.nextInt();
            vetorInt[contador] = valor;
            soma = soma + valor;

            if (contador == 0) {
                maior = valor;
                menor = valor;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            contador++;

        } while(vetorInt.length > contador);

        media = (double) soma / vetorInt.length;

        System.out.println("Maior Valor: " + maior + " | Menor valor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Média Final: " + media);

    }
}


