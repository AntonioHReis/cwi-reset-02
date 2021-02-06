package OO;

public class Aplicacao {

    public static void main(String[] args) {

        Calculadora calcular = new Calculadora();

        int valor1 = 2;
        int valor2 = 2;

        System.out.println(valor1 + " + " + valor2 + " = " + calcular.somar(valor1, valor2));
        System.out.println(valor1 + " - " + valor2 + " = " + calcular.subtrair(valor1, valor2));
        System.out.println(valor1 + " * " + valor2 + " = " + calcular.multiplicar(valor1, valor2));
        System.out.println(valor1 + " / " + valor2 + " = " + calcular.dividir(valor1, valor2));
    }
}
