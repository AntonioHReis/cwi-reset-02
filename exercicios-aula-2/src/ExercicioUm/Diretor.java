package ExercicioUm;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;

    public Diretor(String nome, LocalDate nascimento, int quantidadeFilmesDirigidos, Genero genero) {
        super(nome, nascimento, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de filmes dirigidos: "+this.quantidadeFilmesDirigidos);
    }
}
