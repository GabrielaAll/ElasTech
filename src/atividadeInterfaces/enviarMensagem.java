package atividadeInterfaces;
import java.util.ArrayList;

//Crie uma interface Notificacao com o método enviar(String mensagem).
interface Notificacao{
    void enviar(String mensagem);
}

//Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito.
class Email implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Email enviado: " + mensagem);
    }
}

class SMS implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}

//Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.
//Saída esperada:
//E-mail enviado: Sua compra foi aprovada!
//SMS enviado: Sua compra foi aprovada!
public class enviarMensagem {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao n : notificacoes) {
            n.enviar("Sua compra foi aprovada!");
        }
    }
}
