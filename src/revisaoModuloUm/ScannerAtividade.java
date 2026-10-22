package revisaoModuloUm;

import java.util.Scanner;

public class ScannerAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");

        // 2. Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("No seu próximo aniversário você fará " + (idade + 1) + " anos.");

        // 3. Pergunte dois números e mostre a soma.
        System.out.print("Digite dois números. \nDigite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("A soma dos dois números é: " + (num1 + num2));

        // 4. Pergunte a altura e o peso e imprima os dois numa frase.
        System.out.print("Digite a sua altura (use vírgula): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu peso (use vírgula): ");
        double peso = sc.nextDouble();
        System.out.println("Você tem " + altura + "m de altura e pesa " + peso + " kg.");

        // 🔥 Mini-desafio — Ordem: idade, nome, cidade
        System.out.println("\nMINI-DESAFIO");

        System.out.print("Digite a sua idade: ");
        int idadeDesafio = sc.nextInt();

        // 💡 O SEGREDO DA DICA: Limpar o "Enter" que ficou sobrando do nextInt()
        sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nomeDesafio = sc.nextLine();

        System.out.print("Digite a sua cidade (onde você mora): ");
        String cidadeDesafio = sc.nextLine();

        // Imprimindo a ficha
        System.out.println("\n=== FICHA CADASTRAL ===");
        System.out.println("Nome: " + nomeDesafio);
        System.out.println("Idade: " + idadeDesafio + " anos");
        System.out.println("Cidade: " + cidadeDesafio);

        sc.close();
    }
}

