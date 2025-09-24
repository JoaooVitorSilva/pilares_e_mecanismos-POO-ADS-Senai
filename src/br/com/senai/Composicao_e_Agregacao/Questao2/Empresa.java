package br.com.senai.Composicao_e_Agregacao.Questao2;

import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void exibirFuncionarios() {
        System.out.println("=== Funcionários da empresa " + nome + " ===");
        for (Funcionario f : funcionarios) {
            f.exibir();
        }
    }
}
