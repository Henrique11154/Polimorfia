package SuperClasse;
public abstract class Animal {
    
    protected double peso;
    protected int idade;
    protected int numeroMembros;

    public Animal(double peso, int idade, int numeroMembros) {
        this.peso = peso;
        this.idade = idade;
        this.numeroMembros = numeroMembros;
    }

    public abstract void locomover();

    public abstract void emitirSom();

    public abstract void alimentar();


    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
    public int getNumeroMembros() {
        return numeroMembros;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNumeroMembros(int numeroMembros) {
        this.numeroMembros = numeroMembros;
    }
    
}
