package ExercicioUm;

public class Diretor {

    private String nome;
    private int idade;
    private int quantidadeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome, int idade, int quantidadeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir (){
        System.out.println("Nome do diretor..: " + this.nome);
        System.out.println("Idade............: " + this.idade);
        System.out.println("Gênero...........: " + this.genero);
    }
}
