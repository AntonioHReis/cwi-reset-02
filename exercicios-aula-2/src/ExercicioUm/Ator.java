package ExercicioUm;

public class Ator extends Pessoa {

    private int numeroOscarVencidos;

    public Ator(String nome, int idade, int numeroOscarVencidos, Genero genero) {
        super( nome, idade, genero);
        this.numeroOscarVencidos = numeroOscarVencidos;
    }

}
