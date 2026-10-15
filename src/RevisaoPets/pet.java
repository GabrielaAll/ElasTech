package RevisaoPets;

public class pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public String definirPorte(){
        if (peso < 10){
            return  "Porte Pequeno.";
        }

        else if (peso <25) {
            return  "Porte Médio.";
        }
        else {
            return "Porte Grande.";
        }
    }

    public void emitirSom(){
        System.out.println( nome + " faz: som...");
    }
}
