//Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

public class Casting {
    static void main(String[] args) {
        double numeroFlutuante = 15.75;

        int numeroInteiro = (int) numeroFlutuante; //CONVERTENDO UM NÚMERO DECIMAL PARA INTEIRO.

        System.out.println(numeroFlutuante);
        System.out.println(numeroInteiro);
    }
}
