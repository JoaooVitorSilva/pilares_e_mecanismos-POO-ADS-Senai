package br.com.senai.Composicao_e_Agregacao.Questao1;

public class Janela {
    private int tamanho;

    public Janela(int tamanho) {
        this.tamanho = tamanho;
    }

    public void exibir() {
        System.out.println("Janela de tamanho: " + tamanho);
    }
}
