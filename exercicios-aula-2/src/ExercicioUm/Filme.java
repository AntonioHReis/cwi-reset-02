package ExercicioUm;

public class Filme {
    private String nome;
    private String descricao;
    private String duracao;
    private int anoLancamento;
    private int avaliacao;
    private Diretor Diretor;

    public Filme(String nome, String descricao, String duracao, int anoLancamento, int avaliacao, Diretor Diretor) {
        defineAvalicacao(avaliacao);
        validaNome(nome);
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.Diretor = Diretor;
    }

    public void validaNome(String nome){
        if(nome.equals("O clube da Luta")) {
            this.avaliacao = 5;
        } else if (nome.equals("Batman vs Superman")) {
            this.avaliacao = 1;
        }
    }

    public void defineAvalicacao(Integer avaliacao) {
        if(avaliacao < 1 || avaliacao > 5) {
            this.avaliacao = 3;
        }
        else {
            this.avaliacao = avaliacao;
        }
    }

    public void reproduzir(){
        System.out.println("Nome do filme..: "+this.nome);
        System.out.println("Descrição......: "+this.descricao);
        System.out.println("Duração........: "+this.duracao);
        System.out.println("Diretor........: "+this.Diretor.getNome());
        System.out.println("Avaliação......: "+this.avaliacao);
    }

}
