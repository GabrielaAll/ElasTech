package revisaoModuloUm;

public class variaveisEtipos {
    public static void main(String[] args) {

        //Variáveis e tipos
        //Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        //Crie uma variável cidade e imprima: "Eu moro em Salvador."
        //Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
        //Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
        //Crie uma variável temCarteira com true e imprima.

        String nome = "Gariela";
        int idade = 27;
        double altura = 1.64;
        boolean jáProgramou = true;

        System.out.println("Eu me chamo: " + nome);
        System.out.println("Eu tenho: " + idade + " anor.");
        System.out.println("Minha altura é: " + altura);
        System.out.println("Já programei? " + jáProgramou);

        String cidade = "Salvador";
        System.out.println("\nEu moro em: " + cidade);

        String primeiroNOme = "Sabrina";
        String sobrenome = "Alves";
        System.out.println("\n" + primeiroNOme + " " + sobrenome);

        double preco = 29.90;
        System.out.println("\nComprei uma luminária por: R$" + preco);

        boolean temCarteira = true;
        System.out.println("\nEliana já tem carteira de habilitação? " + temCarteira);

        //🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
        //💡 Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.

        int a = 10;
        int b = 20;

        int terceiraVariavel = a;
        a = b;
        b = terceiraVariavel;
        System.out.println("a = " + a + " b = " + b);

    }
}
