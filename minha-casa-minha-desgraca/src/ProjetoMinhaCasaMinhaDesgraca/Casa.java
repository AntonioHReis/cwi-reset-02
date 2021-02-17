package ProjetoMinhaCasaMinhaDesgraca;

public class Casa extends Imovel{
    private boolean patio;

    public Casa(String logradouro, int numero, String complemento, String bairro, String cidade,
                UnidadeFederativa estado, double valor, boolean patio) {
        super(logradouro, numero, complemento, bairro, cidade, estado, valor);
        this.patio = patio;
    }

    public String apresentacao() {
        String mensagem;
        if(this.patio == true){
            mensagem = "Este imóvel é uma casa com patio e o ";
        }
        else {
            mensagem = "Este imóvel é uma casa sem patio e o ";
        }
        return mensagem+super.apresentacao();
    }
}
