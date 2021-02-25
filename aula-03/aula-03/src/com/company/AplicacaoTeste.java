package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Editora novaEditora1 = new Editora("Viena","São paulo");
        System.out.println("Editora: "+novaEditora1.getNome());

        Editora novaEditora2 = new Editora("DC COMICS","São paulo");
        System.out.println("Editora: "+novaEditora2.getNome());

        Filme filme = new Filme();

    }

}
