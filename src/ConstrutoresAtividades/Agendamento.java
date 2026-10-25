package ConstrutoresAtividades;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;

    }

    //   Crie um método mostrar() que imprime tudo.
    public void mostrar() {
        System.out.println("Agendamento de " + nomePet);
        System.out.println("Serviço: " + servico + " às " + horario);
        System.out.println("Perfume: " + perfume + " Laço: " + laco + " Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto + "%");
    }


    public static void main(String[] args) {

        //a) Thor, banho, 14h, com perfume e laço, sem hidratação, "alérgico a shampoo", 10% de desconto
        Agendamento a1 = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10.0);

        // b) Luna, tosa, 10h, sem nenhum extra, sem observação, sem desconto
        Agendamento a2 = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0);

        // c) Mel, banho, 16h, só com hidratação, sem observação, sem desconto
        Agendamento a3 = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0.0);

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();
    }
}
