package SingletonAtividades;

public class ContadorVisitas {

    // Atributo estatico que guarda a unica copia da classe
    private static ContadorVisitas instancia;

    // Atributo normal da classe
    private int total = 0;

    // Construtor privado
    private ContadorVisitas() {
    }

    // Método que controla a instancia
    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }

    // main para teste
    public static void main(String[] args) {
        // Obtendo a mesma instância em variáveis diferentes
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        // Registra as visitas
        pagina1.registrarVisita();
        pagina2.registrarVisita();
        pagina1.registrarVisita();

        // imprime o total
        System.out.println("Total de visitas: " + pagina2.getTotal());
    }
}