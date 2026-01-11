import java.util.Scanner;

public class QuadradoCirculo {
    static void main(String[] args) {
        /*
        Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base
        na opção selecionada

        Q: AREA = LADO * LADO  | C: AREA = PI * RAIO²

        */

        Scanner esc = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner r = new Scanner(System.in);


        int escolha;
        double lado, raio;

        while( true ) {

            System.out.println("DIGITE 1 PARA CÁLCULAR A ÁREA DO QUADRADO E 2 PARA CÁLCULAR A ÁREA DO CIRCULO");
            escolha = esc.nextInt();

            if ( escolha == 1 ) {
                System.out.println("INFORME O LADO DO QUADRADO: ");
                lado = l.nextDouble();

                double areaQuadrado = lado * lado;

                System.out.println("ÁREA DO QUADRADO: " + areaQuadrado + "cm");
                break;

            } else if ( escolha == 2 ) {
                System.out.println("INFORME O RAIO DO CIRCULO: ");
                raio = r.nextDouble();

                double areaCirculo = 3.14 * ( raio * raio );

                System.out.println("ÁREA DO CIRCULO: " + areaCirculo + "cm");
                break;

            } else {
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
    }
}
