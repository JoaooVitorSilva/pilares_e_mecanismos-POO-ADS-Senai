package br.com.senai.Sobrescrita.Questao2;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}
