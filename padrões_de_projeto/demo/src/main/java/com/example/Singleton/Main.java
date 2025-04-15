package com.example.Singleton;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();

        config.setConfiguracao("tema", "escuro");
        config.setConfiguracao("resolucao", "1920x1080");

        System.out.println("Idioma atual: " + config.getConfiguracao("idioma"));
        config.imprimirConfiguracoes();
    }
}