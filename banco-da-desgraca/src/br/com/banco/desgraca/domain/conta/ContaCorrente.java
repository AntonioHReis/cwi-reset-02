package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.Data;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements ContaBancaria{
    private Integer numeroDaConta;
    private InstituicaoBancaria instituicaoBancaria;
    private Double saldoContaCorrente;
    private List <Transacao> movimentacao;

    public ContaCorrente(Integer numeroDaConta, InstituicaoBancaria instituicaoBancaria, Double saldoContaCorrente) {
        this.numeroDaConta = numeroDaConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public ContaCorrente(Integer numeroDaConta, InstituicaoBancaria instituicaoBancaria, Double saldoContaCorrente,
                         List <Transacao> movimentacao) {
        this.numeroDaConta = numeroDaConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldoContaCorrente = saldoContaCorrente;
        this.movimentacao = movimentacao;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return getSaldoContaCorrente();
    }

    @Override
    public void depositar(Double valor) {
        this.movimentacao = new ArrayList<Transacao>();
        Data dataDaTransacao = new Data();
        movimentacao.add(new Transacao(TipoTransacao.DEPOSITAR, dataDaTransacao, valor));
        this.saldoContaCorrente += valor;
        System.out.println("Depositando valor   "+ DecimalFormat.getCurrencyInstance().format(valor)
                          +" na Conta Corrente "+ this.instituicaoBancaria.getDescricao()
                          +" "+this.numeroDaConta);
    }

    @Override
    public void sacar(Double valor) {
        if(valor <= this.saldoContaCorrente){
            //FIXME AQUI TENHO QUE VERIFICAR SE É DIVISIVEL POR 5, 10, 20, 50,100,200
            this.movimentacao = new ArrayList<Transacao>();
            Data dataDaTransacao = new Data();
            movimentacao.add(new Transacao(TipoTransacao.SACAR, dataDaTransacao, valor));
            this.saldoContaCorrente -= valor;
            System.out.println("Sacando valor   "+ DecimalFormat.getCurrencyInstance().format(valor)
                    +" na Conta Corrente "+ this.instituicaoBancaria.getDescricao()
                    +" "+this.numeroDaConta);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if(valor <= this.saldoContaCorrente){
            this.saldoContaCorrente -= valor;

            Double taxaTransferencia = 0.0;

            System.out.println("Conta destino "+contaDestino.getInstituicaoBancaria().getDescricao());
            System.out.println("Numero da conta "+contaDestino);
            //FIXME corrigir erro da conta corrente ==> como pegar a conta corrente que será transferida

            if(!this.instituicaoBancaria.equals(contaDestino.getInstituicaoBancaria())){
                taxaTransferencia = valor * (1.0 /100.0);
                this.saldoContaCorrente -= taxaTransferencia;
            }

            System.out.println("Sacando valor   "+ DecimalFormat.getCurrencyInstance().format(valor)
                    +" na Conta Corrente "+ this.instituicaoBancaria.getDescricao()
                    +" "+this.numeroDaConta);
        }
        else {
            System.out.println("Saldo insuficiente");
        }


    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }

    public void setInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public List<Transacao> getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(List<Transacao> movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(Double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public void imprimirContaCorrente(){
        System.out.println("----Conta Corrente----");
        System.out.println("Número da conta: "+getNumeroDaConta());
        System.out.println("Banco: "+getInstituicaoBancaria().getDescricao());

        for(Transacao transacao : movimentacao){
            transacao.imprimir();
        }
    }

}
