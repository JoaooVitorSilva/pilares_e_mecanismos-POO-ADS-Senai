package br.com.senai.Composicao_e_Agregacao.Questao1;

public class Telhado {
    private String material;

    public Telhado(String material) {
        this.material = material;
    }

    public void exibir() {
        System.out.println("Telhado feito de: " + material);
    }
}
