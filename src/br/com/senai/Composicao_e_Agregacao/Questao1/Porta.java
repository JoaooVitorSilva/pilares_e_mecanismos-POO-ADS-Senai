package br.com.senai.Composicao_e_Agregacao.Questao1;

public class Porta {
    private String cor;

    public Porta(String cor) {
        this.cor = cor;
    }

    public void exibir() {
        System.out.println("Porta de cor: " + cor);
    }
}
