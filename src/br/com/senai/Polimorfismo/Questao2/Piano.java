package br.com.senai.Polimorfismo.Questao2;

public class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("O piano está tocando uma melodia elegante.");
    }
}
