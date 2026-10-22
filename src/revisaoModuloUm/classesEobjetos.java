package revisaoModuloUm;


class Pet{
    String nome;
    String raca;
    double peso;
}

class Produto{
    String nome;
    double preco;
    int quantidade;
}

class Aluna{
    String nome;
    double nota1;
    double nota2;
    double media;

}

class  Jogadora{
    String nome;
    int pontos;
}
public class classesEobjetos {
    public static void main(String[] args) {

        System.out.println("-Primeiro Pet");
        Pet pet1 = new Pet();
        pet1.nome = "Zeus";
        pet1.raca = "Vira-lata";
        pet1.peso = 12.5;
        System.out.println("Nome: " + pet1.nome + " | Raça: " + pet1.raca + " | Peso: " + pet1.peso + "kg");

        //Crie dois pets diferentes e imprima as duas fichas.
        System.out.println("\nNovos Pets:");
        Pet pet2 = new Pet();
        pet2.nome = "MiuMiu";
        pet2.raca = "Persa";
        pet2.peso = 4.1;

        Pet pet3 = new Pet();
        pet3.nome = "Thor";
        pet3.raca = "Golden Retriever";
        pet3.peso = 30.0;

        System.out.println("Ficha 1 - Nome: " + pet2.nome + " | Raça: " + pet2.raca + " | Peso: " + pet2.peso + "kg");
        System.out.println("Ficha 2 - Nome: " + pet3.nome + " | Raça: " + pet3.raca + " | Peso: " + pet3.peso + "kg");

        //Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.
        System.out.println("\n--- ESTOQUE DO PRODUTO ---");
        Produto produto = new Produto();
        produto.nome = "Monitor";
        produto.preco = 850.00;
        produto.quantidade = 10;

        double valorTotalEstoque = produto.preco * produto.quantidade;
        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);

        //Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.
        System.out.println("\n--- FICHA DA ALUNA ---");
        Aluna aluna = new Aluna();
        aluna.nome = "Gabriela";
        aluna.nota1 = 8.5;
        aluna.nota2 = 9.5;

        //Calcula a média e guarda no próprio objeto
        aluna.media = (aluna.nota1 + aluna.nota2) / 2;

        System.out.println("Aluna: " + aluna.nome);
        System.out.println("Nota 1: " + aluna.nota1 + " | Nota 2: " + aluna.nota2);
        System.out.println("Média Final: " + aluna.media);

        // 🔥 Mini-desafio — Jogadora com maior pontuação
        System.out.println("\nMINI-DESAFIO");

        Jogadora j1 = new Jogadora();
        j1.nome = "Anna";
        j1.pontos = 150;

        Jogadora j2 = new Jogadora();
        j2.nome = "Mallory";
        j2.pontos = 320;

        Jogadora j3 = new Jogadora();
        j3.nome = "Carol";
        j3.pontos = 210;

        // Estabelecera primeira como a vencedora até testar as outras
        String nomeVencedora = j1.nome;
        int maiorPontuacao = j1.pontos;

        //Compara com a segunda jogadora
        if (j2.pontos > maiorPontuacao) {
            maiorPontuacao = j2.pontos;
            nomeVencedora = j2.nome;
        }

        //Compara com a terceira jogadora
        if (j3.pontos > maiorPontuacao) {
            maiorPontuacao = j3.pontos;
            nomeVencedora = j3.nome;
        }

        System.out.println("A jogadora com a maior pontuação é: " + nomeVencedora + " (" + maiorPontuacao + " pontos)");
    }

}
