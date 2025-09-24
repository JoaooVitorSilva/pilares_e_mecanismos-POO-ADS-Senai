package br.com.senai.Sobrescrita.Questao1;

public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
