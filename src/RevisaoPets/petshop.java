package RevisaoPets;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class petshop {
    //sobrecarga de metodos
    static void mostrarFicha(pet p){
        System.out.println("Nome: " + p.nome);
    }
    static void mostrarFicha(pet p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.printf("Peso: %.1f kg\n", p.peso);
        System.out.println("Porte: " + p.porte);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pet[] lista = new pet[5];
        int total = 0;
        int opcao = -1;

        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println("\n PETSHOP ");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo do banho");
            System.out.println("7 - Executar todos os serviços");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= 5) {
                            System.out.println("Cadastro cheio! Limite de 5 pets atingido.");
                            break;
                        }
                        System.out.print("Nome do pet: ");
                        String nome = sc.nextLine();
                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();
                        System.out.print("Peso (kg): ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        pet novoPet;
                        if (especie.equalsIgnoreCase("Cachorro")) {
                            novoPet = new cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            novoPet = new gato();
                        } else {
                            novoPet = new pet();
                        }

                        novoPet.nome = nome;
                        novoPet.especie = especie;
                        novoPet.peso = peso;
                        novoPet.porte = novoPet.definirPorte();

                        lista[total] = novoPet;
                        total++;

                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        mostrarFicha(novoPet, "FICHA DO PET");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("PETS CADASTRADOS");
                            for (int i = 0; i < total; i++) {
                                System.out.printf("%s (%s) - %.1f kg - Porte %s\n",
                                        lista[i].nome, lista[i].especie, lista[i].peso, lista[i].porte);
                                lista[i].emitirSom();
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.printf("Encontrado: %s (%s) - %.1f kg\n",
                                        lista[i].nome, lista[i].especie, lista[i].peso);
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(lista[i].especie.toLowerCase());
                        }

                        System.out.println("ESPÉCIES CADASTRADAS");
                        for (String esp : especies) {
                            System.out.println("- " + esp);
                        }
                        System.out.println("\nTotal de espécies diferentes: " + especies.size());
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();
                        filaBanho.add(nomeFila);
                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximo = filaBanho.poll();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 7:
                        System.out.print("Nome do pet para os serviços: ");
                        String nomeServico = sc.nextLine();

                        ArrayList<servico> servicos = new ArrayList<>();
                        servicos.add(new banho());
                        servicos.add(new tosa());
                        servicos.add(new consulta());

                        for (servico s : servicos) {
                            s.executar(nomeServico);
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine(); // Essencial para evitar o loop infinito
            }
        }
        sc.close();
    }
}