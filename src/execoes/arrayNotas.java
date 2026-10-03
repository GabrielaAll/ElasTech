package execoes;

import java.util.Scanner;

public class arrayNotas {
    public static void main(String[] args) {

        //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        double[] notas = {8.1, 9.2, 10.0, 9.2, 7.0};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a posição da nota que deseja visualizar");
            int posicao = sc.nextInt();

            System.out.println("Nota na posição " + posicao + ": " + notas[posicao]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A posição informada não existe. \nO array só vai de 0 a 4.");
        }
        sc.close();
    }
}
