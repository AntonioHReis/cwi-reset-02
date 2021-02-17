package ProjetoMinhaCasaMinhaDesgraca;

public class Imovel extends Endereco{
    private double valor;

    public Imovel(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederativa estado, double valor) {
        super(logradouro, numero, complemento, bairro, cidade, estado);
        this.valor = valor;
    }

   public String apresentacao() {

        return "imóvel localizado no \n"
                + " endereco: "     +this.getLogradouro()
                + " numero: "       +this.getNumero()
                + " complemento: "  +this.getComplemento()
                + " bairro: "       +this.getBairro()
                + " cidade: "       +this.getCidade()
                + " estado: "       +this.getEstado().getEstado();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
