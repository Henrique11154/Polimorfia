package subclasse;

import SuperClasse.Animal;

public class Peixe extends Animal{

    private String corEscama;

    public Peixe(double peso, int idade, int numeroMembros, String corEscama) {
        super(peso, idade, numeroMembros);
        this.corEscama = corEscama;
    }
    
    public void alimentar(){
        System.out.println("Peixe esta filtrando a água.");
    }

    public void locomover(){
        System.out.println("O peixe esta nadando");
    } 

    public void emitirSom(){
        System.out.println("bluuuup");
    }

    public void sotarBolhas(){
        System.out.println("ºººººº");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
