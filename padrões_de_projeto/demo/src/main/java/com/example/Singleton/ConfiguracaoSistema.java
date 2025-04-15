package com.example.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;
    private Map<String, String> configuracoes;

    private ConfiguracaoSistema() {
        configuracoes = new HashMap<>();
        configuracoes.put("tema", "claro");
        configuracoes.put("idioma", "pt-BR");
    }

    public static synchronized ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public void setConfiguracao(String chave, String valor) {
        configuracoes.put(chave, valor);
        System.out.println("Configuração atualizada: " + chave + " = " + valor);
    }

    public String getConfiguracao(String chave) {
        return configuracoes.getOrDefault(chave, "Não encontrada");
    }

    public void imprimirConfiguracoes() {
        System.out.println("=== Configurações Atuais ===");
        configuracoes.forEach((chave, valor) -> 
            System.out.println(chave + ": " + valor)
        );
    }
}