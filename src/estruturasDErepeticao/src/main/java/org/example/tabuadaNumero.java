package org.example;

public class tabuadaNumero {
    public static void main(String[] args) {

        //4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

        int numero = 7;

        System.out.println("Tabuada do número " + numero + ": ");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
