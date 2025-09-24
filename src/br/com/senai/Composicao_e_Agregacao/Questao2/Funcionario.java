package br.com.senai.Composicao_e_Agregacao.Questao2;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibir() {
        System.out.println("Funcionário: " + nome);
    }
}
