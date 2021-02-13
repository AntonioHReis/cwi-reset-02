package ExercicioUm;

public class Filme {

    private String nome;
    private String descricao;
    private String duracao;
    private int anoLancamento;
    private int avaliacao;
    Diretor novoDiretor;

    public Filme(String nome, String descricao, String duracao, int anoLancamento, int avaliacao, Diretor novoDiretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.novoDiretor = novoDiretor;
    }

    public void reproduzir(){
        System.out.println("Nome do filme: "+this.nome);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Duração: "+this.duracao);
        System.out.println("Diretor: "+this.novoDiretor.getNome());
    }

}
