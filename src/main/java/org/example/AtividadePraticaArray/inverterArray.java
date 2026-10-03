package org.example.AtividadePraticaArray;

import java.util.Scanner;

public class inverterArray {
    public static void main(String[] args) {

        //Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
        //Referência:
        //int[]
        //notas = {8, 6, 10, 7, 9};
        //int[] notas = new int[5]
        //•for(int i = 0; i
        //< notas.length;
        //i++){
        //    System.out.println(notas[i]);
        //}

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números de trás para frente: ");

        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
