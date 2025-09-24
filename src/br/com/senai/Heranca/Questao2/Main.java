package br.com.senai.Heranca.Questao2;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Toyota");
        Veiculo v2 = new Moto("Honda");

        System.out.println("=== Movimentação dos veículos ===");
        v1.mover();
        v2.mover();
    }
}
