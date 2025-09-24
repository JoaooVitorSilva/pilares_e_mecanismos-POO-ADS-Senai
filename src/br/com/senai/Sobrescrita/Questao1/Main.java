package br.com.senai.Sobrescrita.Questao1;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Assalariado("Maria", 3000.00);
        Funcionario f2 = new Horista("João", 50.0, 160);

        System.out.println(f1.getNome() + " - Salário: R$ " + f1.calcularSalario());
        System.out.println(f2.getNome() + " - Salário: R$ " + f2.calcularSalario());
    }
}
