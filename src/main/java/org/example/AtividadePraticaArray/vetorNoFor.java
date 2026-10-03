package org.example.AtividadePraticaArray;

public class vetorNoFor {
    public static void main(String[] args) {

        //2 - Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        //3 - Com o mesmo array de notas, calcule e mostre a soma e a média.

        int soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];

        }

        double media = (double) soma / notas.length;

        System.out.println("\nSoma das notas: " + soma);
        System.out.print("Média final: ");
        System.out.printf("%.2f\n", media);

    }
}
