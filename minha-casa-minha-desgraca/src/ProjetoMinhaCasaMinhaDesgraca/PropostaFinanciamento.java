package ProjetoMinhaCasaMinhaDesgraca;
public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private int prazoDePagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int prazoDePagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoDePagamento = prazoDePagamento;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public int getPrazoDePagamento() {
        return prazoDePagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        double valor = beneficiario.getSalario() * getPrazoDePagamento();
        boolean aprovacao = false;

        if(imovel.getEstado().equals("SP")){
            aprovacao = valor >= imovel.getValor() * 0.65;
        }
        else if (imovel.getEstado().equals("RJ")){
            aprovacao = valor >= imovel.getValor() * 0.60;
        }
        else {
            aprovacao = valor >= imovel.getValor() * 0.50;
        }

        if( aprovacao == true) {
            imprimirPropostaAprovada();
        }
        else {
            imprimirPropostaNegada();
        }
    }

    private void imprimirPropostaAprovada(){
        System.out.println("Parabéns sua proposta foi APROVADA Sr.: " + getBeneficiario().getNome());
        imprimirDados();
    }
    private void imprimirPropostaNegada(){
        System.out.println("Sinto muito sua proposta foi NEGADA Sr.: " + getBeneficiario().getNome());
        imprimirDados();
    }

    private void imprimirDados(){
        System.out.println("Você escolheu o prazo de "+getPrazoDePagamento()+" meses.");
        System.out.println("E o imóvel escolhido está localizado no: ");
        System.out.println(" endereco: "     +getImovel().getLogradouro()
                         + " numero: "       +getImovel().getNumero()
                         + " complemento: "  +getImovel().getComplemento()
                         + " bairro: "       +getImovel().getBairro()
                         + " cidade: "       +getImovel().getCidade()
                         + " estado: "       +getImovel().getEstado());
    }
}
