package br.com.senai.Heranca.Questao1;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, "A123");
        Professor professor = new Professor("João", 45, "Matemática");

        System.out.println("=== Dados do Aluno ===");
        aluno.exibirDados();

        System.out.println("\n=== Dados do Professor ===");
        professor.exibirDados();
    }
}

