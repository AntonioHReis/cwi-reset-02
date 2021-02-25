package br.com.banco.desgraca.domain;

public enum TipoTransacao {
    SACAR ("Sacar"),
    DEPOSITAR ("Depositar"),
    TRANSFERIR ("Transferir");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

}
