package atividadeInterfaces;
import java.util.ArrayList;

//Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
interface Veiculo{
    void ligar();
    void acelerar();
}

//  Crie Carro e Moto implementando os dois.
class Carro implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
}

class  Moto implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("Moto ligada.");
    }

    @Override
    public void acelerar(){
        System.out.println("Moto acelerando...");
    }
}

//Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.
public class veiculoAtividade {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo v : veiculos) {
            v.ligar();
            v.acelerar();
        }
    }
}
