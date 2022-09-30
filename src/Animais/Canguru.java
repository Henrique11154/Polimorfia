package Animais;
import subclasse.Mamifero;

public class Canguru extends Mamifero{

    public Canguru(double peso, int idade, int numeroMembros, String corPelo) {
        super(peso, idade, numeroMembros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("Canguru está usando bolsa.");
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        super.locomover();
        System.out.println("Canguru esta pulando.");
    }
    
}
