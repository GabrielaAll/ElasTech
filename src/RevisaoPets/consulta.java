package RevisaoPets;

public class consulta implements servico{
    @Override
    public void executar(String nomePet){
        System.out.println("Levando " + nomePet + " para a consulta.");
    }
}
