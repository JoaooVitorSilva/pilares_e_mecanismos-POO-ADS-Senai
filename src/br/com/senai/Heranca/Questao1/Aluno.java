package br.com.senai.Heranca.Questao1;

public class Aluno extends Pessoa {
    private String matricula;


    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
}
