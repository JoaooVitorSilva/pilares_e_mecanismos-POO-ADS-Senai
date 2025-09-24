package br.com.senai.Sobrecarga.Questao1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.multiplicar(3, 4);
        double resultado2 = calc.multiplicar(2.5, 4.2);
        int resultado3 = calc.multiplicar(2, 3, 4);

        System.out.println("Resultado 1 (int): " + resultado1);
        System.out.println("Resultado 2 (double): " + resultado2);
        System.out.println("Resultado 3 (3 parâmetros): " + resultado3);
    }
}
