package ProjetoMinhaCasaMinhaDesgraca;

public enum UnidadeFederativa {
    AC ("AC"), AL ("AL"), AP ("AP"), AM ("AM"), BA ("BA"), CE ("CE"),
    ES ("ES"), GO ("GO"), MA ("MA"), MT ("MT"), MS ("MS"), MG ("MG"),
    PA ("PA"), PB ("PB"), PR ("PR"), PE ("PE"), PI ("PI"), RJ ("RJ"),
    RN ("RN"), RS ("RS"), RO ("RO"), RR ("RR"), SC ("SC"), SP ("SP"),
    SE ("SE"), TO ("TO");

    private String estado;

    UnidadeFederativa(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
