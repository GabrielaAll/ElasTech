package execoes;

import java.util.Scanner;

public class stringNula {
    public static void main(String[] args) {

        //4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;

        try {
            int tamanho = nome.length();

            System.out.println("Tamanho do nome: " + tamanho);
        }

        catch (NullPointerException e){
            System.out.println("O nome não foi preenchido.");
        }

    }
}
