package subclasse;
import SuperClasse.Animal;

public class Aves extends Animal{
    
    private String corPena;

    public Aves(double peso, int idade, int numeroMembros, String corPena) {
        super(peso, idade, numeroMembros);
        this.corPena = corPena;
    }

    public void alimentar(){
        System.out.println("");
    }

    public void locomover(){
        System.out.println("O passaro esta voando");
    } 

    public void emitirSom(){
        System.out.println("Piu");
    }

    public void fazerNinho(){
        System.out.println("Ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
