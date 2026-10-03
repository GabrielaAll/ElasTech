package org.example.AtividadePraticaArray;

public class vetorNomes {
    public static void main(String[] args) {

        //Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Breno", "Gabriel", "Carla", "Maria", "Estefania"};

        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Terceiro nome: " + nomes[2]);
        System.out.println("Ultimo nome: " + nomes[nomes.length - 1]);

    }

}
