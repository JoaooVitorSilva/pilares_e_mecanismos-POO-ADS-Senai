package br.com.senai.Composicao_e_Agregacao.Questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Ana");
        Funcionario f2 = new Funcionario("Carlos");
        Funcionario f3 = new Funcionario("Beatriz");

        List<Funcionario> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);

        Empresa empresa = new Empresa("Tech Solutions", lista);
        empresa.exibirFuncionarios();

        System.out.println("\n--- Empresa fechou ---");
        empresa = null;

        System.out.println("Funcionários ainda existem fora da empresa:");
        f1.exibir();
        f2.exibir();
        f3.exibir();
    }
}
