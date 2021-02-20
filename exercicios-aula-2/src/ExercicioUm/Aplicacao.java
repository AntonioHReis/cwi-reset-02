package ExercicioUm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate diaDeHoje = LocalDate.now();

/*      System.out.println("Dia de hoje: "+diaDeHoje);

        LocalDate nascimento = LocalDate.parse("30-09-1962", formatter);
        System.out.println("Nascimento: "+nascimento);
*/
        List<Pessoa> elenco = new ArrayList<Pessoa>();

        elenco.add(new Diretor("Jose da Silva",  LocalDate.parse("03-10-2000",formatter),
                3, Genero.MASCULILNO));
        elenco.add(new Ator("Marcos da Silva", LocalDate.parse("27-04-1999",formatter),
                0, Genero.MASCULILNO));
        elenco.add(new Ator("Mariazinha", LocalDate.parse("07-11-1998",formatter),
                2, Genero.FEMININO));
        elenco.add(new Ator("Joaninha", LocalDate.parse("03-03-2000",formatter),
                2, Genero.FEMININO));

 /*       Diretor diretor1 = new Diretor("Jose da Silva",  LocalDate.parse("03-10-2000",formatter), 3,
                Genero.MASCULILNO);
        Diretor diretor2 = new Diretor("Mario Dutra", LocalDate.parse("30-09-1962",formatter), 4,
                Genero.MASCULILNO);

        System.out.println("Diretores convidados:");
        diretor1.imprimir();
        diretor2.imprimir();

        Ator ator1 = new Ator("Marcos da Silva", LocalDate.parse("27-04-1999",formatter), 0, Genero.MASCULILNO);
        Ator ator2 = new Ator( "Mariazinha", LocalDate.parse("07-11-1998",formatter), 2, Genero.FEMININO);
        Ator ator3 = new Ator( "Joaninha", LocalDate.parse("03-03-2000",formatter), 2, Genero.FEMININO);

        System.out.println("Atores convidados:");
        ator1.imprimir();
        ator2.imprimir();
*/
        System.out.println("Filmes concorrentes ao Oscar:");
        Filme novoFilme1 = new Filme("O Retorno", "A volta dos que foram", "2.23.45",
                1999, 5,  elenco);
        novoFilme1.reproduzir();

        novoFilme1.creditos();

        Filme novoFilme2 = new Filme("AO Infinito e além", "Viagem ao infinito", "1.33.00",
                2009, 5,  elenco);
        novoFilme2.reproduzir();

        novoFilme2.creditos();
    }
}
