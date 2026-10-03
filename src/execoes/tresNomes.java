package execoes;

public class tresNomes {
    public static void main(String[] args) {

        //6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = {"Julia", "Agatha", "Carla"};

        try {
            System.out.println(nomes[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");
    }
}
