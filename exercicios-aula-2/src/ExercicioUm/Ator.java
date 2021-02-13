package ExercicioUm;

public class Ator {

    private String nome;
    private int idade;
    private int numeroOscarVencidos;
    private Genero genero;

    public Ator(String nome, int idade, int numeroOscarVencidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroOscarVencidos = numeroOscarVencidos;
        this.genero = genero;
    }

    public void imprimir (){
        System.out.println("Nnme do ator..: " + this.nome);
        System.out.println("Idade.........: " + this.idade);
        System.out.println("Gênero........: " + this.genero);
    }
}
