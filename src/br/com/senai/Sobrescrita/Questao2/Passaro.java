package br.com.senai.Sobrescrita.Questao2;

public class Passaro extends Animal {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " canta: Piu Piu!");
    }
}
