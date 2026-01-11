import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner nsc = new Scanner(System.in);

        System.out.println("INFORME UM NÚMERO PARA REALIZAR A TABUADA: ");
        int num = nsc.nextInt();

        for (int i = 0; i <= 10; i++ ) {
            System.out.println(num + " * " + i + " = " + num * i);
        }



    }
}
