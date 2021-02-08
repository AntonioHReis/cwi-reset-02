public class Aplicacao {

    public static void main(String[] args) {

        Comparador compare = new Comparador();

        int numero1 = 10;
        int numero2 = 50;

        System.out.println(numero1 + " < " + numero2 + " ? "+compare.menorQue(numero1,numero2));

    }
}
