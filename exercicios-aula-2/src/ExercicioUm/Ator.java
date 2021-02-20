package ExercicioUm;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private int numeroOscarVencidos;

    public Ator(String nome, LocalDate nascimento, int numeroOscarVencidos, Genero genero) {
        super( nome, nascimento, genero);
        this.numeroOscarVencidos = numeroOscarVencidos;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de oscar ganhos: "+this.numeroOscarVencidos);
    }
}
