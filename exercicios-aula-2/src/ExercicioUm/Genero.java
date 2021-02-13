package ExercicioUm;

public enum Genero {
    MASCULILNO ( "Masculino"),
    FEMININO ( "Feminino"),
    NAO_BINARIO ( "Não binário");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
