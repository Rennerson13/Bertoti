package com.example.Composite;

import java.util.LinkedList;
import java.util.List;

public class Folder implements ComponenteSistemaArquivos {
    private String nome;
    private List<ComponenteSistemaArquivos> itens = new LinkedList<>();

    public Folder(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteSistemaArquivos item) {
        itens.add(item);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("📂 Pasta: " + nome);
        for (ComponenteSistemaArquivos item : itens) {
            item.exibirConteudo();
        }
    }
}
