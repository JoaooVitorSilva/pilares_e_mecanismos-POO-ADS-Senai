package br.com.senai.Polimorfismo.Questao1;

public class Main {
    public static void main(String[] args) {

        Forma f1 = new Quadrado(4);
        Forma f2 = new Circulo(3);
        Forma f3 = new Triangulo(6, 2);

        Forma[] formas = {f1, f2, f3};

        System.out.println("=== Áreas das Formas ===");
        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
