package atividadeBuilder;

public class TesteBuilder {
    public static void main(String[] args) {

        // a) Thor: Aqui configuramos só o que ele pediu. Fica claro o que é cada true!
        Agendamento a1 = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(10.0)
                .build();

        // b) Luna: Sem extras, sem desconto, sem complicação.
        // Não precisamos passar um monte de "false" ou "0.0". O Java assume isso por padrão.
        Agendamento a2 = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        // c) Mel: Só precisa da hidratação.
        Agendamento a3 = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        // Mostrando tudo
        a1.mostrar();
        a2.mostrar();
        a3.mostrar();
    }
}
