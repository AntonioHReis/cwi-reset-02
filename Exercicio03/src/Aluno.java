public class Aluno {

    //Atributos
    private String nomeAluno;
    private float notaFinal;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    //Métodos
    public String verAprovacao(){
        if (this.notaFinal < 7)
            return "Reprovado";
        else
            return "Aprovado";
    }
}
