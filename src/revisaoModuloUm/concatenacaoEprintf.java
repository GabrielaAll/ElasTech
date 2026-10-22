package revisaoModuloUm;

public class concatenacaoEprintf {
    public static void main(String[] args) {

        //Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        String nome = "Ana";
        int idade = 28;
        System.out.println(nome + " tem " + idade + " anos.");

        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média das notas: %.2f\n", media);

        //Crie uma variável com o preço de um produto e imprima com duas casas decimais.
        double preco = 38.70;
        System.out.printf("Preço do produto: R$ %.2f\n", preco);

        //Usando printf, imprima numa linha só o nome, a idade e a altura.
        double altura = 1.65;
        System.out.printf("Nome: %s | Idade: %d anos | Altura: %.2f m\n", nome, idade, altura);

        // 🔥 Mini-desafio
        System.out.println("\nRECIBO DA COMPRA");

        double total = 0;

        String produto1 = "Livro de Python";
        double preco1 = 85.50;

        String produto2 = "Teclado Mecânico";
        double preco2 = 265.00;

        String produto3 = "Mousepad";
        double preco3 = 64.99;


        System.out.printf("%s: R$ %.2f\n", produto1, preco1);
        total += preco1;


        System.out.printf("%s: R$ %.2f\n", produto2, preco2);
        total += preco2;


        System.out.printf("%s: R$ %.2f\n", produto3, preco3);
        total += preco3;

        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", total);
    }
}

