package ExercicioUm;

public class Aplicacao {

    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Jose da Silva", 37, 3, Genero.MASCULILNO);
        Diretor diretor2 = new Diretor("Maria da Silva", 73, 4, Genero.FEMININO);

        System.out.println("Diretores convidados:");
        diretor1.imprimir();
        diretor2.imprimir();

        Ator ator1 = new Ator("Marcos da Silva", 35, 0, Genero.MASCULILNO);
        Ator ator2 = new Ator( "Mariazinha", 33, 2, Genero.FEMININO);

        System.out.println("Atores convidados:");
        ator1.imprimir();
        ator2.imprimir();

        System.out.println("Filmes concorrentes ao Oscar:");
        Filme novoFilme1 = new Filme("O Retorno", "A volta dos que foram", "2.23.45",
                1999, 5,  diretor1);
        novoFilme1.reproduzir();

        Filme novoFilme2 = new Filme("AO Infinito e além", "Viagem ao infinito", "1.33.00",
                2009, 5,  diretor2);
        novoFilme2.reproduzir();


    }
}
