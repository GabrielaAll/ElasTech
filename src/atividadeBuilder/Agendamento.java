package atividadeBuilder;

import lombok.Builder;

@Builder // Essa anotação mágica do Lombok cria o Builder por debaixo dos panos!
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    // Mantivemos o mostrar() apenas para imprimir bonito igual antes
    public void mostrar() {
        System.out.println("--- Agendamento de " + nomePet + " ---");
        System.out.println("Serviço: " + servico + " às " + horario);
        System.out.println("Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao);
        System.out.println("Observação: " + (observacao != null ? observacao : ""));
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("-----------------------------");
    }
}
