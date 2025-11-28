//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

public class Media {
    static void main(String[] args) {
        double[] notas = {5.1, 8, 7, 6.5, 9};

        //       SEGUNDA MANEIRA DE FAZER
//        double[] notas;
//        notas = new double[]{5.1, 8, 7, 6.5, 9};

        double media;
        double soma = 0;

        for (int i = 0; notas.length > i; i ++ ) {
            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println(media);

    }
}
