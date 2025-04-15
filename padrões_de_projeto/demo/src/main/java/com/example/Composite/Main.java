package com.example.Composite;

public class Main {
    public static void main(String[] args) {
        TextFile doc1 = new TextFile("documento1.txt");
        TextFile doc2 = new TextFile("documento2.txt");

        Folder subPasta = new Folder("SubPasta");
        subPasta.adicionar(doc1);

        Folder pastaPrincipal = new Folder("PastaRaiz");
        pastaPrincipal.adicionar(subPasta);
        pastaPrincipal.adicionar(doc2);

        pastaPrincipal.exibirConteudo();
    }
}
