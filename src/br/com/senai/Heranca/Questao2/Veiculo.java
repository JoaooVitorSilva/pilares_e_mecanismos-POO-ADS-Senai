package br.com.senai.Heranca.Questao2;

public class Veiculo {
    private String marca;


    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


    public void mover() {
        System.out.println("O veículo está se movendo...");
    }
}
