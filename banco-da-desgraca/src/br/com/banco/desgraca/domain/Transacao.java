package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;
import java.time.LocalDate;

public class Transacao {
    private TipoTransacao tipoDeTransacao;
    private Data dataDaTransacao;
    private Double valorDaTransacao;

    public Transacao(TipoTransacao tipoDeTransacao, Data dataDaTransacao, Double valorDaTransacao) {
        this.tipoDeTransacao = tipoDeTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.valorDaTransacao = valorDaTransacao;
    }

    public TipoTransacao getTipoDeTransacao() {
        return tipoDeTransacao;
    }

    public Data getDataDaTransacao() {
        return dataDaTransacao;
    }

    public Double getValorDaTransacao() {
        return valorDaTransacao;
    }

    public void imprimir(){
        System.out.println("Tipo de transação...: "+this.tipoDeTransacao);
        System.out.println("Data da transação...: "+this.dataDaTransacao);
        System.out.println("Valor da transação..: "+this.valorDaTransacao);
    }
}
