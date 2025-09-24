package br.com.senai.Sobrescrita.Questao2;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}
