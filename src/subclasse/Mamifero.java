package subclasse;
import SuperClasse.Animal;

public class Mamifero extends Animal{

    private String corPelo;

    public Mamifero(double peso, int idade, int numeroMembros, String corPelo) {
            super(peso, idade, numeroMembros);
            this.corPelo = corPelo;
    }

    public void alimentar(){
        System.out.println("Mamifero está mamando.");
    }

    public void locomover(){
        System.out.println("O mamifero está andando");
    } 

    public void emitirSom(){
        System.out.println("Auuuu,auuuu");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
