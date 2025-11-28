public class UmAcinquenta {
    static void main(String[] args) {
        int contador = 0, soma = 0;

        while(contador < 50) {
            contador++;
            soma += contador;
        }

        System.out.println("A soma dos número de 1 a 50 é de: " + soma);
    }
}
