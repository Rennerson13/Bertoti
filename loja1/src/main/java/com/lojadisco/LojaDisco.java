package com.lojadisco;

import java.util.LinkedList;
import java.util.List;

public class LojaDisco {

    public List<Vinil> vinis = new LinkedList<>(); // Lista para armazenar vinis
    public List<Cd> cds = new LinkedList<>(); // Lista para armazenar CDs

    // Cadastrando Vinis
    public void cadastrarVinil(String nomeVinil, String generoMusical, String artista, int quantidadeEstoque) {
        Vinil vinil = new Vinil(nomeVinil, generoMusical, artista, quantidadeEstoque);
        vinis.add(vinil);
        System.out.println(nomeVinil + " adicionado ao estoque!");
    }

    // Cadastrando CDs
    public boolean cadastrarCD(String nomeCd, String generoMusical, String artista, int quantidadeEstoque) {
        Cd cd = new Cd(nomeCd, generoMusical, artista, quantidadeEstoque);
        cds.add(cd);
        System.out.println(nomeCd + " adicionado ao estoque!");
        return true;
    }

    // Buscar Vinil por Nome
    public Vinil buscarVinilPorNome(String nomeVinil) {
        for (Vinil Vinil : vinis) {
            if (Vinil.getNomeVinil().equalsIgnoreCase(nomeVinil)) {
                System.out.println(Vinil + " encontrado!");
                return Vinil;
            }
        }
        System.out.println("Vinil não encontrado!");
        return null;
    }

    // Buscar CD por Nome
    public Cd buscarCdPorNome(String nomeCd) {
        for (Cd cd : cds) {
            if (cd.getnomeCd().equalsIgnoreCase(nomeCd)) {
                System.out.println(cd + " encontrado!");
                return cd;
            }
        }
        System.out.println("CD não encontrado!");
        return null;
    }
}
