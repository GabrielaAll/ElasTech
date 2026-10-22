package revisaoModuloUm;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoDEexecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Divisão por zero
        System.out.println("DIVISÃO");

        try {
            System.out.print("Digite um número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite outro número (tente digitar 0): ");
            int num2 = sc.nextInt();
            System.out.println("Resultado da divisão: " + (num1 / num2));
        }

        catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }

        //Posição inválida de array
        System.out.println("\nARRAY DE NOTAS");
        double[] notas = {8.0, 7.5, 9.0, 6.0, 10.0};

        try {
            System.out.print("Digite a posição da nota que deseja ver (0 a 4): ");
            int pos = sc.nextInt();
            System.out.println("A nota escolhida foi: " + notas[pos]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Posição inválida! O array só vai de 0 a 4.");
        }

        //Digitar texto onde espera número (InputMismatchException)
        System.out.println("\nIDADE (TEXTO x NÚMERO)");

        try {
            System.out.print("Digite sua idade (tente digitar uma palavra): ");
            int idade = sc.nextInt();
            System.out.println("Sua idade é: " + idade);
        }

        catch (InputMismatchException e) {
            System.out.println("Erro: Você deveria ter digitado um número inteiro!");
            sc.nextLine();
        }

        //NullPointerException
        System.out.println("\nVARIÁVEL NULA");

        try {
            String nomeNulo = null;
            System.out.println("Quantidade de letras: " + nomeNulo.length());
        }

        catch (NullPointerException e) {
            System.out.println("Erro: A variável de texto está vazia (null), não tem como medir o tamanho.");
        }

        //O programa continua funcionando
        System.out.println("\nO PROGRAMA CONTINUA");

        try {
            String[] nomes = {"Ana", "Bia", "Carol"};
            System.out.println("Tentando imprimir a posição 5... -> " + nomes[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro capturado: Posição não existe.");
        }

        System.out.println("O programa continua funcionando normalmente após o try/catch!");

        // 🔥 Mini-desafio — Três catch diferentes
        System.out.println("\n🔥 MINI-DESAFIO");

        try {

            // TESTE 1: Causa um erro de matemática
            // int erroMatematico = 10 / 0;

            // TESTE 2: Causa um erro de array
            // int[] arrayTeste = {1, 2}; int erroArray = arrayTeste[5];

            // TESTE 3: Causa um erro genérico (ex: tentar converter uma letra para número)
            // int erroGenerico = Integer.parseInt("Gabi");

            System.out.println("Se você não descomentar nada, o código passa direto sem erros!");

        }

        catch (ArithmeticException e) {
            System.out.println("Catch acionado: Erro de matemática (ArithmeticException).");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch acionado: Erro de array (ArrayIndexOutOfBoundsException).");
        }

        catch (Exception e) {

            System.out.println("Catch acionado: Erro genérico (Exception). Pegou o que sobrou!");
        }

        sc.close();
    }
}
