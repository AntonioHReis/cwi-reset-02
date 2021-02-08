public class Aplicacao {

    public static void main(String[] args) {

        Aluno novoAluno = new Aluno();

        novoAluno.setNomeAluno("Antonio H Reis");
        novoAluno.setNotaFinal(8.5F);
        System.out.println(novoAluno.getNomeAluno() + " você foi: "+novoAluno.verAprovacao());

    }
}
