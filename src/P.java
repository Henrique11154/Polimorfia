import Animais.Cobra;
import Animais.Tarturuga;
import subclasse.Aves;
import subclasse.Reptil;
import subclasse.Mamifero;
import subclasse.Peixe;

public class P {
    public static void main(String[] args) {

        //Animal a = new Animal(50, 5, 4);
        Mamifero m = new Mamifero(55, 17, 2, "preto");
        Reptil r = new Reptil(0.500, 5, 0, "neon");

        Peixe p = new Peixe(0.3, 1, 1, "rozelha");

        Aves a = new Aves(0.2, 5, 2, "marrom");

        Veterinario v = new Veterinario();
        v.atendeAnimal(m);
        v.atendeAnimal(r);
        v.atendeAnimal(p);
        v.atendeAnimal(a);

        Tarturuga t = new Tarturuga(100, 50, 4,
        "verde");
   
        Cobra c = new Cobra(2, 2, 0, "amarelo");
   
        t.locomover();
        c.locomover();
    }

}
