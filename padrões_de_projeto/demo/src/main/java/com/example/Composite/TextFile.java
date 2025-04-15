package com.example.Composite;

public class TextFile implements ComponenteSistemaArquivos {
    private String nomeArquivo;

    public TextFile(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("📄 Arquivo: " + nomeArquivo);
    }
}