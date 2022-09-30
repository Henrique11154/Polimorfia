package subclasse;
import SuperClasse.Animal;

public class Reptil extends Animal{
    
    private String corEscama;

    public Reptil(double peso, int idade, int numeroMembros, String corEscama) {
        super(peso, idade, numeroMembros);
        this.corEscama = corEscama;
    }

    public void alimentar(){
        System.out.println("O reptil esta comendo");
    }

    public void locomover(){
        System.out.println("O reptil esta rastejando");
    } 

    public void emitirSom(){
        System.out.println("shshshhshs");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
