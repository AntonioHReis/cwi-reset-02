package ExercicioUm;

import java.util.List;

public class Filme {
    private String nome;
    private String descricao;
    private String duracao;
    private int anoLancamento;
    private int avaliacao;
    private List <Pessoa> elenco;

    public Filme(String nome, String descricao, String duracao, int anoLancamento, int avaliacao,
                 List<Pessoa> elenco) {
        defineAvalicacao(avaliacao);
        validaNome(nome);
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.elenco = elenco;
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
        System.out.println("\n\n");
        System.out.println("Nome do filme..: "+this.nome);
        System.out.println("Descrição......: "+this.descricao);
        System.out.println("Duração........: "+this.duracao);
        System.out.println("Avaliação......: "+this.avaliacao);
    }

    public void creditos(){
        System.out.println("----"+this.nome+"----");
        System.out.println("Elenco");
        for (Pessoa pessoa : elenco) {
            pessoa.imprimir();
        }
    }

}
