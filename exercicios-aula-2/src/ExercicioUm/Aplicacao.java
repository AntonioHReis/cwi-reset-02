package ExercicioUm;

public class Aplicacao {

    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Jose da Silva", 37, 3);

        Filme novoFilme1 = new Filme("O Retorno", "A volta dos que foram", "2.23.45",
                1999, 5,  diretor1);

        novoFilme1.reproduzir();

        Diretor diretor2 = new Diretor("Maria da Silva", 73, 4);

        Filme novoFilme2 = new Filme("AO Infinito e além", "Viagem ao infinito", "2.23.45",
                2009, 5,  diretor2);

        novoFilme2.reproduzir();

    }
}
