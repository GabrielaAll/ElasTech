package SingletonAtividades;

public class respostasAtividade {
    /*16 de out.

1. O que o padrão Singleton garante?


a) Que a classe tenha vários construtores

b) Que exista apenas um objeto da classe no programa

c) Que a classe não tenha atributos

d) Que a classe possa ser herdada

Resposta: B



2. Por que o construtor de um Singleton é private?

Resposta: porque não permite que outras classes usem um 'new' e criem cópias.



3. Complete a lacuna:



java

private ______ Configuracao instancia;

a) final

b) public

c) static

d) void

Resposta: C; private 'static' Configuracao instancia.

4. O que acontece se alguém tentar escrever isto fora da classe?

java

Configuracao c = new Configuracao();

Resposta: VAi dar erro no código, porque o construtor vai estar fora de uma classe. Gera confusãpo no construtor já que ele é quem inicializa os objetos gerados a partir de uma classe, sendo assim, se estiver fora o construtor não tem como iniciar a instancia. Além do que, o compiler do Java não permite comandos ou blocos soltos dentro do arquivo.


5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?

a) new Configuracao()

b) Configuracao.getInstancia()

c) Configuracao.instancia

d) this.getInstancia()

Resposta: b) Configuracao.getInstancia()

     */
}
