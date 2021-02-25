package com.company.domain;

import com.company.exception.EditoraException;

public class Editora {
    private String nome;
    private String localizacao;

    public Editora(String nome, String localizacao) {
        validarNome(nome);
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    private void validarNome(String nome){
        if (nome.equals("DC COMICS")){
            throw new EditoraException("\n\nPQP! Não pode instanciar esta editora! Comece novamente.");
        }

    }
}
