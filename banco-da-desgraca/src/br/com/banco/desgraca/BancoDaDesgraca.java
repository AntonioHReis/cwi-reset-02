package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

import java.text.DecimalFormat;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("Olá Pessoal \n" +
                "Infelizemente nesta semana me enrolei com algumas atividades\n" +
                "e também\n" +
                "me enrolei com alguns conceitos que não consegui aplicar\n" +
                "neste Banco da Desgraca.\n" +
                "Espero, ver como resolvê-los na sexta-feira!\n" +
                "Antonio H Reis\n");



        //Cadastrando uma conta corrente
        ContaCorrente contaCorrente1 = new ContaCorrente(1000, InstituicaoBancaria.BANCO_DO_BRASIL,
                0.0);
        // System.out.println("Saldo na conta corrente: " + DecimalFormat.getCurrencyInstance().format(contaCorrente1.getSaldoContaCorrente()));

        //Cadastrando uma conta corrente
        ContaCorrente contaCorrente2 = new ContaCorrente(2000, InstituicaoBancaria.CAIXA,
                0.0);
        //System.out.println("Saldo na conta corrente: " + DecimalFormat.getCurrencyInstance().format(contaCorrente1.getSaldoContaCorrente()));

        //Depositando na conta Corrente
        contaCorrente1.depositar(1000.0);
        contaCorrente2.depositar(22550.0);

        //Sacando na conta corrente
        contaCorrente1.sacar(500.0);
        contaCorrente2.sacar(1000.0);


        contaCorrente1.imprimirContaCorrente();
        contaCorrente2.imprimirContaCorrente();
/*
        //Transferindo valor entre contas
        //FIXME problemas de parâmetros para resolver

        contaCorrente1.transferir(200.0, contaCorrente2);
        System.out.println("Saldo na conta corrente1: "
                + DecimalFormat.getCurrencyInstance().format(contaCorrente1.getSaldoContaCorrente()));
        System.out.println("Saldo na conta corrente2: "
                + DecimalFormat.getCurrencyInstance().format(contaCorrente2.getSaldoContaCorrente()));


*/
    }
}
