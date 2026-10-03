package execoes;

import java.util.Scanner;

public class restoDAdivisao {
    public static void main(String[] args) {

        //5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            int resto = 100 % numero;

            System.out.println("O resto da divisdão do número por 100 é: " + resto);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é permitido dividir por zero.");

        }
        sc.close();
    }
}