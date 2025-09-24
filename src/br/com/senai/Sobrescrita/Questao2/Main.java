package br.com.senai.Sobrescrita.Questao2;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex");
        Animal a2 = new Gato("Mimi");
        Animal a3 = new Passaro("Loro");

        System.out.println("=== Sons dos Animais ===");
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}
