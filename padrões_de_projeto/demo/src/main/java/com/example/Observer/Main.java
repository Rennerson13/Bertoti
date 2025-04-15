package com.example.Observer;

public class Main {
    public static void main(String[] args) {
        AlertaEmergencia sistemaAlerta = new AlertaEmergencia();

        OuvinteAlerta radio = new Radio();
        OuvinteAlerta sirene = new Sirene();

        sistemaAlerta.adicionarOuvinte(radio);
        sistemaAlerta.adicionarOuvinte(sirene);

        sistemaAlerta.emitirAlerta("Furacão categoria 4 a caminho!");

        sistemaAlerta.removerOuvinte(radio);
        sistemaAlerta.emitirAlerta("Alerta de evacuação imediata!");
    }
}