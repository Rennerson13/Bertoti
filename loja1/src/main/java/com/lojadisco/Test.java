package com.lojadisco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LojaDiscoTest {

    LojaDisco lojaDisco = new LojaDisco();

    @Test
    public void testeCadastrarProdutos() {
        // Cadastro de Vinis
        lojaDisco.cadastrarVinil("The Dark Side of the Moon", "Rock Progressivo", "Pink Floyd", 100);
        lojaDisco.cadastrarVinil("Sgt. Pepper's Lonely Hearts Club Band", "Rock Psicodélico", "The Beatles", 50);

        assertTrue(lojaDisco.vinis.get(lojaDisco.vinis.size() - 1).getNomeVinil().equals("Sgt. Pepper's Lonely Hearts Club Band"));

        // Cadastro de CDs
        lojaDisco.cadastrarCD("Nevermind", "Grunge", "Nirvana", 200);
        lojaDisco.cadastrarCD("OK Computer", "Alternativo", "Radiohead", 150);

        assertTrue(lojaDisco.cds.get(lojaDisco.cds.size() - 1).getNomeCd().equals("OK Computer"));
    }

    @Test
    public void testeBuscarVinil() {
        // Busca de Vinis
        lojaDisco.cadastrarVinil("The Dark Side of the Moon", "Rock Progressivo", "Pink Floyd", 100);
        lojaDisco.cadastrarVinil("Sgt. Pepper's Lonely Hearts Club Band", "Rock Psicodélico", "The Beatles", 50);

        Vinil vinil = lojaDisco.buscarVinil("Sgt. Pepper's Lonely Hearts Club Band");
        assertEquals("Sgt. Pepper's Lonely Hearts Club Band", vinil.getNomeVinil());
    }

    @Test
    public void testeBuscarCD() {
        //busca CD
        lojaDisco.cadastrarCD("Nevermind", "Grunge", "Nirvana", 200);
        lojaDisco.cadastrarCD("OK Computer", "Alternativo", "Radiohead", 150);

        Cd cd = lojaDisco.buscarCD("OK Computer");
        assertEquals("OK Computer", cd.getNomeCd());
    }
}
