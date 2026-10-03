package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class idadeNome {
    public static void main(String[] args) {

        //3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Idade digitada: " + idade);
        }

        catch (InputMismatchException e){
            System.out.println("Por favor, informe um número válido!");
        }
        sc.close();
    }
}
