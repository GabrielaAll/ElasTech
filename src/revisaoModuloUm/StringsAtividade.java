package revisaoModuloUm;

import java.util.Scanner;

public class StringsAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Peça o nome completo e mostre quantas letras ele tem.
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("Quantidade total de caracteres (incluindo espaços): " + nomeCompleto.length());

        //Peça o nome e mostre em MAIÚSCULO e em minúsculo.
        System.out.print("\nDigite o seu primeiro nome: ");
        String nome = sc.nextLine();

        System.out.println("Tudo maiúsculo: " + nome.toUpperCase());
        System.out.println("Tudo minúsculo: " + nome.toLowerCase());

        //Peça o nome e mostre a primeira letra.
        //A contagem começa do zero, então a primeira letra está na posição 0.
        System.out.println("Primeira letra do seu nome: " + nome.charAt(0));

        //Peça uma frase e uma palavra. Diga se a palavra aparece na frase.
        System.out.print("\nDigite uma frase qualquer: ");
        String frase = sc.nextLine();

        System.out.print("Digite uma palavra para buscar nessa frase: ");
        String palavraBusca = sc.nextLine();

        if (frase.contains(palavraBusca)) {
            System.out.println("A palavra '" + palavraBusca + "' APARECE na frase!");
        }

        else {
            System.out.println("A palavra '" + palavraBusca + "' NÃO aparece na frase.");
        }

        //Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.
        System.out.print("\nDigite um nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite o mesmo nome novamente (pode misturar maiúsculas/minúsculas): ");
        String nome2 = sc.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais!");
        }

        else {
            System.out.println("Os nomes são diferentes!");
        }

        //Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).
        System.out.print("\nDigite um nome colocando vários espaços no começo e no fim: ");
        String nomeComEspacos = sc.nextLine();

        // trim() tira os espaços das pontas. toUpperCase() deixa tudo maiúsculo.
        String nomeTratado = nomeComEspacos.trim().toUpperCase();
        System.out.println("Nome tratado (sem espaços e maiúsculo): ->" + nomeTratado + "<-");

        // 🔥 Mini-desafio — Começa e termina com a mesma letra
        System.out.println("\nMINI-DESAFIO");
        System.out.print("Digite uma palavra: ");
        String palavraDesafio = sc.nextLine();

        //Converter tudo para minúsculo para ignorar o tamanho da letra
        String palavraConvertida = palavraDesafio.toLowerCase();

        //Pegar a primeira e a última letra
        char primeiraLetra = palavraConvertida.charAt(0);
        char ultimaLetra = palavraConvertida.charAt(palavraConvertida.length() - 1);

        //Comparar as duas
        if (primeiraLetra == ultimaLetra) {
            System.out.println("Resultado: sim (começa e termina com a mesma letra)");
        }

        else {
            System.out.println("Resultado: não (começa e termina com letras diferentes)");
        }

        sc.close();
    }
}
