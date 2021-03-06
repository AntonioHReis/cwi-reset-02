package ProjetoMinhaCasaMinhaDesgraca;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();

        /**
         * INÍCIO
         *
         * NÃO MODIFICAR ESTA CLASSE ANTES DESTA LINHA.
         */

        final int QUANTIDADE = 1;   // Quantidade de imóveis que desejar registrar para efeitos de teste

        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.println("Digitando dados do imóvel: \n\n");
            System.out.print("Digite o logradouro........: ");
            String logradouroLido = new Scanner(System.in).nextLine();
            System.out.print("Digite o número............: ");
            int numeroLido = new Scanner(System.in).nextInt();
            System.out.print("Digite o complemento.......: ");
            String complementoLido = new Scanner(System.in).nextLine();
            System.out.print("Digite o bairro............: ");
            String bairroLido = new Scanner(System.in).nextLine();
            System.out.print("Digite a cidade............: ");
            String cidadeLida = new Scanner(System.in).nextLine();
            System.out.print("Digite o estado............: ");
            String estadoLido = new Scanner(System.in).nextLine();
            System.out.print("Digite o valor do imóvel...: ");
            double valorLido = new Scanner(System.in).nextDouble();

            UnidadeFederativa valorEstado = UnidadeFederativa.valueOf(estadoLido);

            System.out.println("Este imóvel é uma casa (Sim/Não)? ");
            String eUmaCasa = new Scanner(System.in).nextLine();
            if (eUmaCasa.equals("Sim") == true){
                System.out.println("Esta casa possui um pátio (Sim/Não) ?");
                String temPatio = new Scanner(System.in).nextLine();
                boolean patioLido = false;
                if( temPatio.equals("Sim") == true){
                    patioLido = true;
                }
                Casa novoImovel =  new Casa(logradouroLido,numeroLido,complementoLido,bairroLido,cidadeLida,
                        valorEstado,valorLido,patioLido);
                opcoesParaFinanciamento.registrarImovel(novoImovel);
            }
            else {
                System.out.println("Este apartamento está localizado em qual andar? ");
                int andar = new Scanner(System.in).nextInt();
                Apartamento novoImovel =  new Apartamento(logradouroLido,numeroLido,complementoLido,bairroLido,cidadeLida,
                        valorEstado,valorLido,andar);
                opcoesParaFinanciamento.registrarImovel(novoImovel);
            }
            // Imovel novoImovel = new Imovel(logradouroLido,numeroLido,complementoLido,bairroLido,cidadeLida,valorEstado,valorLido);
            // A linha acima foi substituida pelas classes Casa ou Apartamento.
        }

        /**
         * FIM
         *
         * NÃO MODIFICAR ESTA CLASSE APÓS ESTA LINHA.
         */

        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                    + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).nextLine();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+ DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, no estado %s, " +
                          "pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEstado(),
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();



    }

}
