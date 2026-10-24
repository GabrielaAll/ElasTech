package SingletonAtividades;

public class Carrinho {

        private static Carrinho instancia;

        //atributo quantidadeItens, começando em 0;
        private int quantidadeItens = 0;

        private Carrinho() {
        }

        //Método para pegar a instância
        public static Carrinho getInstancia() {
            if (instancia == null) {
                instancia = new Carrinho();
            }
            return instancia;
        }

        //método adicionarItem() que soma 1 à quantidade
        public void adicionarItem() {
            quantidadeItens++;
        }

        //método getQuantidadeItens() que devolve a quantidade
        public int getQuantidadeItens() {
            return quantidadeItens;
        }

        // main para teste
        public static void main(String[] args) {
            // Obtendo o carrinho em "telas" diferentes
            Carrinho telaProdutos = Carrinho.getInstancia();
            Carrinho telaPromocoes = Carrinho.getInstancia();

            // Adicionando itens pelas duas telas
            telaProdutos.adicionarItem();
            telaProdutos.adicionarItem();
            telaPromocoes.adicionarItem();
            telaPromocoes.adicionarItem();

            // Imprimindo o total para provar que as duas telas mexem no mesmo carrinho
            System.out.println("Itens no carrinho: " + telaPromocoes.getQuantidadeItens());
        }
}