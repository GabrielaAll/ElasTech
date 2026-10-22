package revisaoModuloUm;

public class Metodos {
    //Crie um método mostrarBoasVindas() que imprime uma mensagem.
    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao sistema!");
    }

    //Crie saudacao(String nome) que imprime "Olá, [nome]!".
    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    //Crie dobro(int numero) que devolve o dobro.
    static int dobro(int numero) {
        return numero * 2;
    }

    //Crie calcularMedia(double n1, double n2) que devolve a média.
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    //Crie ehPar(int numero) que devolve true ou false.
    static boolean ehPar(int numero) {
        // Se o resto da divisão por 2 for zero, é par (retorna true)
        return numero % 2 == 0;
    }

    //Crie dois métodos somar (Sobrecarga de métodos).
    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // 🔥 Mini-desafio — Método que chama outro método
    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static void liberarEntrada(int idade) {
        // O if já entende que ehMaiorDeIdade retorna true ou false
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Entrada liberada! (Idade: " + idade + ")");
        } else {
            System.out.println("Entrada bloqueada. Menor de idade! (Idade: " + idade + ")");
        }
    }


    // MÉTODO MAIN - Onde chamamos tudo o que foi criado acima

    public static void main(String[] args) {

        System.out.println("1. Boas-vindas");
        mostrarBoasVindas();

        System.out.println("\nSaudação");
        saudacao("Gabriela");
        saudacao("João");
        saudacao("Pedro");

        System.out.println("\nDobro");
        int resultadoDobro = dobro(15);
        System.out.println("O dobro de 1789 é: " + resultadoDobro);

        System.out.println("\nMédia");
        double media = calcularMedia(8.5, 7.0);
        System.out.printf("A média é: %.2f\n", media);

        System.out.println("\nÉ Par?");
        int numeroTeste = 1249;
        if (ehPar(numeroTeste)) {
            System.out.println("O número " + numeroTeste + " é PAR.");
        } else {
            System.out.println("O número " + numeroTeste + " é ÍMPAR.");
        }

        System.out.println("\nSomar (Sobrecarga)");
        System.out.println("Soma de dois números (10 + 20): " + somar(10, 20));
        System.out.println("Soma de três números (10 + 20 + 30): " + somar(10, 20, 30));

        System.out.println("\n🔥 MINI-DESAFIO:");

        // Chamando apenas o segundo método, que chama o primeiro internamente
        liberarEntrada(27);
        liberarEntrada(15);
    }
}
