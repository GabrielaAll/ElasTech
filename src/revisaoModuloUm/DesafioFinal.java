package revisaoModuloUm;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DesafioFinal {
    // Método obrigatório para calcular a classificação a partir da nota
    static String definirClassificacao(double nota) {
        if (nota >= 8.0) {
            return "Ótimo";
        } else if (nota >= 5.0) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array de filmes com 5 posições e um contador real
        Filme[] listaFilmes = new Filme[5];
        int totalCadastrados = 0;

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\nMEU CATÁLOGO");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            // Tratamento de exceção para não quebrar se o usuário digitar letra
            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do enter sempre que ler número
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                sc.nextLine(); // Limpa a letra errada do buffer para não dar loop infinito
                continue; // Volta para o início do while
            }

            switch (opcao) {
                case 1:
                    // 1 - Cadastrar
                    if (totalCadastrados >= listaFilmes.length) {
                        System.out.println("Catálogo cheio! Limite de 5 filmes atingido.");
                        break;
                    }

                    // Instanciando o objeto Filme ANTES de preencher
                    Filme novoFilme = new Filme();

                    System.out.print("Título: ");
                    novoFilme.titulo = sc.nextLine();

                    System.out.print("Gênero: ");
                    novoFilme.genero = sc.nextLine().toUpperCase(); // Guarda em maiúsculo

                    System.out.print("Nota (0 a 10): ");
                    novoFilme.nota = sc.nextDouble();
                    sc.nextLine(); // Limpa o buffer da nota

                    // Chama o método para classificar automaticamente
                    novoFilme.classificacao = definirClassificacao(novoFilme.nota);

                    // Guarda no array e sobe o contador
                    listaFilmes[totalCadastrados] = novoFilme;
                    totalCadastrados++;

                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    // 2 - Listar
                    if (totalCadastrados == 0) {
                        System.out.println("Nenhum filme cadastrado ainda.");
                        break;
                    }

                    System.out.println("\nLISTA DE FILMES");
                    for (int i = 0; i < totalCadastrados; i++) {
                        System.out.printf("%s [%s] - Nota %.1f - %s\n",
                                listaFilmes[i].titulo,
                                listaFilmes[i].genero,
                                listaFilmes[i].nota,
                                listaFilmes[i].classificacao);
                    }
                    break;

                case 3:
                    // 3 - Buscar por título
                    if (totalCadastrados == 0) {
                        System.out.println("Catálogo vazio.");
                        break;
                    }

                    System.out.print("Qual filme você está buscando? ");
                    String busca = sc.nextLine();
                    boolean encontrou = false;

                    for (int i = 0; i < totalCadastrados; i++) {
                        if (listaFilmes[i].titulo.equalsIgnoreCase(busca)) {
                            System.out.println("\nEncontrado:");
                            System.out.printf("%s [%s] - Nota %.1f - %s\n",
                                    listaFilmes[i].titulo,
                                    listaFilmes[i].genero,
                                    listaFilmes[i].nota,
                                    listaFilmes[i].classificacao);
                            encontrou = true;
                            break; // Se achou, não precisa olhar o resto
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Filme não encontrado.");
                    }
                    break;

                case 4:
                    // 4 - Estatísticas
                    if (totalCadastrados == 0) {
                        System.out.println("Sem dados para estatísticas.");
                        break;
                    }

                    double somaNotas = 0;
                    int posicaoMaiorNota = 0;
                    int contagemOtimos = 0;

                    for (int i = 0; i < totalCadastrados; i++) {
                        // Somar notas
                        somaNotas += listaFilmes[i].nota;

                        // Verificar melhor filme
                        if (listaFilmes[i].nota > listaFilmes[posicaoMaiorNota].nota) {
                            posicaoMaiorNota = i;
                        }

                        // Verificar quantidade de ótimos
                        if (listaFilmes[i].classificacao.equals("Ótimo")) {
                            contagemOtimos++;
                        }
                    }

                    double media = somaNotas / totalCadastrados;

                    System.out.println("\nESTATÍSTICAS");
                    System.out.println("Total de filmes: " + totalCadastrados);
                    System.out.printf("Média das notas: %.2f\n", media);
                    System.out.println("Melhor filme: " + listaFilmes[posicaoMaiorNota].titulo);
                    System.out.println("Filmes ótimos: " + contagemOtimos + " de " + totalCadastrados);
                    break;

                case 5:
                    System.out.println("Obrigada por usar o catálogo. Tchau!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 5.");
                    break;
            }
        }

        sc.close();
    }
}
