package com.lojadisco;

public class Cd {
// Atributos
private String nomeCd; // Nome do CD
private String generoMusical; // Gênero musical do CD
private String artista; // Artista do CD
private int quantidadeEstoque; // Quantidade em estoque

// Construtor
public Cd(String nomeCd, String generoMusical, String artista, int quantidadeEstoque) {
    this.nomeCd = nomeCd;
    this.generoMusical = generoMusical;
    this.artista = artista;
    this.quantidadeEstoque = quantidadeEstoque;
}

// Métodos de Acesso (arrumar getNomeCd)
public String getnomeCd() {
    return nomeCd;
}

public void setnomeCd(String nomeCd) {
    this.nomeCd = nomeCd;
}

public String getGeneroMusical() {
    return generoMusical;
}

public void setGeneroMusical(String generoMusical) {
    this.generoMusical = generoMusical;
}

public String getArtista() {
    return artista;
}

public void setArtista(String artista) {
    this.artista = artista;
}

public int getQuantidadeEstoque() {
    return quantidadeEstoque;
}

public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
}

// Método toString personalizado
@Override
public String toString() {
    return "CD{" +
            "nomeCd='" + nomeCd + '\'' +
            ", generoMusical='" + generoMusical + '\'' +
            ", artista='" + artista + '\'' +
            ", quantidadeEstoque=" + quantidadeEstoque +
            '}';
}
}

