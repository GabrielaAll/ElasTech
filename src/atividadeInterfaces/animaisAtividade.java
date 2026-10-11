package atividadeInterfaces;
import  java.util.ArrayList;

//Crie uma interface Animal com o método emitirSom().
interface Animal{
    void emitirSom();
}

//  Crie a classe Cachorro que implementa ela e imprime "Au au!".
//   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
class Cachorro implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    }
}
//Agora acrescente a classe Gato, que implementa a mesma interface e imprime "Miau!".
class Gato implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

//Na main, declare as duas variáveis como Animal:
// Animal bidu = new Cachorro();
// Animal salem= new Gato();
//Chame emitirSom() nas duas.
public class animaisAtividade {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.emitirSom();


        Animal bidu = new Cachorro();
        Animal salem = new Gato();
        bidu.emitirSom();
        salem.emitirSom();

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}