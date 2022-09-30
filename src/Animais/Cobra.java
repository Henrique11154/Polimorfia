package Animais;
import subclasse.Reptil;
public class Cobra extends Reptil{

    public Cobra(double peso, int idade, int numeroMembros, String corEscama) {
        super(peso, idade, numeroMembros, corEscama);
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        super.locomover();
        System.out.println("Ratejando");
    }
    
    
}
