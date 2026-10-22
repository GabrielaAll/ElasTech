package revisaoModuloUm;

import java.util.Scanner;

public class ArraysAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
        String[] nomes = {"Gabriela", "Aline", "Bruna", "Carlos", "Daniel"};

        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Terceiro nome: " + nomes[2]);
        System.out.println("Último nome: " + nomes[4]);

        //Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
        System.out.println("\nLista de Notas");
        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posição " + i + " -> Nota: " + notas[i]);
        }

        //Com o mesmo array, calcule e imprima a soma e a média.
        int somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double mediaNotas = (double) somaNotas / notas.length;

        System.out.println("\nSoma de todas as notas: " + somaNotas);
        System.out.println("Média das notas: " + mediaNotas);

        //Crie um array com 5 números e descubra qual é o maior.
        int[] numeros = {12, 45, 89, 23, 7};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // Atualiza se encontrar um número maior
            }
        }

        System.out.println("\nO maior número do array é: " + maior);

        //Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
        int[] notasCorte = {8, 5, 10, 4, 7};
        int contador = 0;

        for (int i = 0; i < notasCorte.length; i++) {
            if (notasCorte[i] >= 7) {
                contador++;
            }
        }
        System.out.println("\nQuantidade de notas maiores ou iguais a 7: " + contador);

        // 🔥 Mini-desafio — Buscar posição do nome no array
        System.out.println("\nMINI-DESAFIO: BUSCA DE NOME");
        String[] listaNomes = {"Maria", "João", "Lucas", "Julia", "Pedro"};

        System.out.print("Qual nome você quer procurar na lista? ");
        String nomeBusca = sc.nextLine();

        //posição ainda não encontrada
        int posicao = -1;

        for (int i = 0; i < listaNomes.length; i++) {

            //compara ignorando maiúsculas e minúsculas
            if (listaNomes[i].equalsIgnoreCase(nomeBusca)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Encontrei! O nome '" + nomeBusca + "' está na posição: " + posicao);
        }

        else {
            System.out.println("O nome '" + nomeBusca + "' não está na lista.");
        }

        sc.close();
    }
}
