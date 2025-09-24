package br.com.senai.Composicao_e_Agregacao.Questao1;

public class Casa {
    private Porta porta;
    private Janela janela;
    private Telhado telhado;

    public Casa(String corPorta, int tamanhoJanela, String materialTelhado) {
        this.porta = new Porta(corPorta);
        this.janela = new Janela(tamanhoJanela);
        this.telhado = new Telhado(materialTelhado);
    }

    public void exibir() {
        System.out.println("=== Detalhes da Casa ===");
        porta.exibir();
        janela.exibir();
        telhado.exibir();
    }
}
