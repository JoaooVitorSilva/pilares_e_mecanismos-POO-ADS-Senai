package br.com.senai.Heranca.Questao2;

public class Moto extends Veiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("A moto da marca " + getMarca() + " está acelerando pela estrada.");
    }
}

