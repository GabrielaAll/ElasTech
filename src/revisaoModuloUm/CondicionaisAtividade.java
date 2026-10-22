package revisaoModuloUm;

import java.util.Scanner;

public class CondicionaisAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Peça a idade e diga se a pessoa é maior ou menor de idade.
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        else {
            System.out.println("Você é menor de idade.");
        }

        //Peça um número e diga se ele é par ou ímpar.
        System.out.print("\nDigite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        }

        else {
            System.out.println("O número é ÍMPAR.");
        }

        //Peça dois números e diga qual é o maior. Se forem iguais, avise.
        System.out.print("\nDigite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        }

        else if (num2 > num1) {
            System.out.println("O maior é: " + num2);
        }

        else {
            System.out.println("Os dois números são iguais.");
        }

        //Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
        System.out.print("\nDigite a nota (use vírgula): ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovada!");
        }

        else if (nota >= 5.0) {
            System.out.println("Recuperação.");
        }

        else {
            System.out.println("Reprovada.");
        }

        //Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete.
        System.out.print("\nEscolha um sabor de sorvete (1 a 3): ");
        int sabor = sc.nextInt();

        switch (sabor) {
            case 1:
                System.out.println("Você escolheu: Morango");
                break;
            case 2:
                System.out.println("Você escolheu: Chocolate");
                break;
            case 3:
                System.out.println("Você escolheu: Flocos");
                break;
            default:
                System.out.println("Opção inválida. Sem sorvete para você!");
                break;
        }

        // 6. Ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
        System.out.print("\nPara calcular o ingresso, digite novamente sua idade: ");
        int idadeIngresso = sc.nextInt();

        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            System.out.println("Valor do ingresso: R$ 10,00");
        }

        else {
            System.out.println("Valor do ingresso: R$ 25,00");
        }

        // 🔥 Mini-desafio — Classificação do triângulo
        System.out.println("\nMINI-DESAFIO DO TRIÂNGULO");
        System.out.println("Digite os valores dos lados de um triângulo");
        System.out.print("Lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Classificação: Equilátero (Todos os lados iguais)");
        }

        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Classificação: Isósceles (Dois lados iguais)");
        }

        else {
            System.out.println("Classificação: Escaleno (Todos os lados diferentes)");
        }

        sc.close();
    }
}

