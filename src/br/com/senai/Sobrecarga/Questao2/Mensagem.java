package br.com.senai.Sobrecarga.Questao2;

import java.util.List;

public class Mensagem {

    public void enviar(String texto) {
        System.out.println("Mensagem enviada: " + texto);
    }

    public void enviar(String texto, String destinatario) {
        System.out.println("Mensagem para " + destinatario + ": " + texto);
    }

    public void enviar(String texto, List<String> destinatarios) {
        System.out.println("Mensagem enviada para vários destinatários:");
        for (String d : destinatarios) {
            System.out.println(" - " + d + ": " + texto);
        }
    }
}
