package ProjetoMinhaCasaMinhaDesgraca;

public class Apartamento extends Imovel {
    private int andar;

    public Apartamento(String logradouro, int numero, String complemento, String bairro, String cidade,
                       UnidadeFederativa estado, double valor, int andar) {
        super(logradouro, numero, complemento, bairro, cidade, estado, valor);
        this.andar = andar;
    }

    public String apresentacao() {
        String mensagem = "Este imóvel é um apartamento no andar: "+this.andar+" e o ";
        return mensagem+super.apresentacao();
    }

}
