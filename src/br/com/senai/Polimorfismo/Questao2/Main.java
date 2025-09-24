package br.com.senai.Polimorfismo.Questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instrumento i1 = new Violao();
        Instrumento i2 = new Bateria();
        Instrumento i3 = new Piano();


        List<Instrumento> orquestra = new ArrayList<>();
        orquestra.add(i1);
        orquestra.add(i2);
        orquestra.add(i3);


        System.out.println("=== Orquestra tocando ===");
        for (Instrumento instrumento : orquestra) {
            instrumento.tocar();
        }
    }
}
