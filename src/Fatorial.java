import java.util.Scanner;

public class Fatorial {
    static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        int contador = 0, fatorial = 1;

        Scanner nsc = new Scanner(System.in);
        System.out.println("INFORME UM NÚMERO PARA SABER SEU FATORIAL");
        int num = nsc.nextInt();

        while ( contador < num ) {
            contador++;
            fatorial *= contador;
        }

        System.out.println(fatorial);

    }
}
