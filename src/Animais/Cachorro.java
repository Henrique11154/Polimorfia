package Animais;
import subclasse.Mamifero;

public class Cachorro extends Mamifero{

    public Cachorro(double peso, int idade, int numeroMembros, String corPelo) {
        super(peso, idade, numeroMembros, corPelo);
    }
    
    public void enterarOssos(){
        System.out.println("O cachorro esta enterrando o osso");
    }

    public void abanarORabo(){
        System.out.println("Cachorro está feliz, e abana o rabo");
    }
    
}
