package RevisaoPets;

public class tosa implements servico{
    @Override
    public void executar(String nomePet){
        System.out.println("Tosando " + nomePet + " . ");
    }
}
