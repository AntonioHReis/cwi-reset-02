package ExercicioUm;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate nascimento, Genero genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public void imprimir (){
        System.out.println("Nome..........: " + this.nome);
        System.out.println("Nascimento....: " + this.nascimento.format(formatter));
        System.out.println("Idade.........: " + Period.between(this.nascimento,LocalDate.now()).getYears() + " anos");
        System.out.println("Gênero........: " + this.genero.getDescricao());
    }

}
