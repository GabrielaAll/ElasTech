package execoes;

import java.util.Scanner;

public class divisaoZero {
    public static void main(String[] args) {

        //1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro:");
            int num1 = sc.nextInt();

            System.out.println("Digite outro número inteiro:");
            int num2 = sc.nextInt();

            int divisao = num1 / num2;
            System.out.println("Divisão dos dois números: " + divisao);
        }

        catch (ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }

        sc.close();
    }
}
