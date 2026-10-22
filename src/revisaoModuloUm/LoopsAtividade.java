package revisaoModuloUm;

import java.util.Scanner;

public class LoopsAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Imprima os números de 1 a 20, um por linha.
        System.out.println("Números de 1 a 20");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
        System.out.println("\nContagem Regressiva");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Fim!");

        //Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.print("\nDigite um número para ver a tabuada: ");
        int numeroTabuada = sc.nextInt();

        System.out.println("Tabuada do " + numeroTabuada + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        //Imprima só os números pares de 1 a 30.
        System.out.println("\nNúmeros pares de 1 a 30");

        for (int i = 2; i <= 30; i += 2) {
            System.out.println(i);
        }

        //Usando for, some todos os números de 1 a 100 e mostre o resultado.
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("\nSoma de 1 a 100: " + soma);

        //Refaça o primeiro exercício com while. Compare os dois códigos.
        System.out.println("\nNúmeros de 1 a 20");
        int contador = 1;

        while (contador <= 20) {
            System.out.println(contador);
            contador++;
        }

        //Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1.
        System.out.println("\nJOGO");
        int energia = 3;
        do {
            System.out.println("Jogando... Energia atual: " + energia);
            energia--;
        } while (energia > 0);

        // 🔥 Mini-desafio — Triângulo de asteriscos
        System.out.println("\nMINI-DESAFIO: TRIÂNGULO");
        System.out.print("Digite a altura do Triângulo: ");
        int altura = sc.nextInt();

        //O laço de fora controla em qual linha estamos
        for (int linha = 1; linha <= altura; linha++) {

            //O laço de dentro imprime a quantidade de asteriscos equivalente ao número da linha atual
            for (int asteriscos = 1; asteriscos <= linha; asteriscos++) {
                System.out.print("*");
            }

            //Quebra a linha após terminar de imprimir os asteriscos daquela linha
            System.out.println();
        }

        sc.close();
    }
}