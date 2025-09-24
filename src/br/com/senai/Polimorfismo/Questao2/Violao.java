package br.com.senai.Polimorfismo.Questao2;

public class Violao extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("O violão está tocando acordes suaves.");
    }
}
