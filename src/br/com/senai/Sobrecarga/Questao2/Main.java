package br.com.senai.Sobrecarga.Questao2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mensagem msg = new Mensagem();

        msg.enviar("Sistema atualizado com sucesso!");

        msg.enviar("Olá, reunião às 14h.", "Maria");

        List<String> lista = Arrays.asList("Ana", "Carlos", "Beatriz");
        msg.enviar("Treinamento amanhã às 9h.", lista);
    }
}
