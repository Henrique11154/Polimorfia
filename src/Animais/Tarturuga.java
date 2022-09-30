package Animais;
import subclasse.Reptil;

public class Tarturuga extends Reptil{

    public Tarturuga(double peso, int idade, int numeroMembros, String corEscama) {
        super(peso, idade, numeroMembros, corEscama);
    }
    
    public void locomover(){
        System.out.println("A tartaruga anda muito lento");
    }
}
