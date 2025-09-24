package br.com.senai.Heranca.Questao2;

public class Carro extends Veiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("O carro da marca " + getMarca() + " está rodando pelas ruas.");
    }
}
