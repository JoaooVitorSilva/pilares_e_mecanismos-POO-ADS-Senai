package br.com.senai.Sobrescrita.Questao2;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}
