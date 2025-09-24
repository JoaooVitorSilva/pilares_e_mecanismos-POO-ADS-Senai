package br.com.senai.Polimorfismo.Questao2;

public class Bateria extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("A bateria está marcando o ritmo com batidas fortes.");
    }
}

