package com.lojadisco;

public class Vinil {
  // Atributos
  private String nomeVinil; // Nome do vinil
  private String generoMusical; // Gênero musical do vinil
  private String artista; // Artista do vinil
  private int quantidadeEstoque; // Quantidade em estoque

  // Construtor
  public Vinil(String nomeVinil, String generoMusical, String artista, int quantidadeEstoque) {
      this.nomeVinil = nomeVinil;
      this.generoMusical = generoMusical;
      this.artista = artista;
      this.quantidadeEstoque = quantidadeEstoque;
  }

  // Métodos de Acesso
  public String getNomeVinil() {
      return nomeVinil;
  }

  public void setNomeVinil(String nomeVinil) {
      this.nomeVinil = nomeVinil;
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

//   // Método toString personalizado
//   @Override
//   public String toString() {
//       return "Vinil{" +
//               "nomeVinil='" + nomeVinil + '\'' +
//               ", generoMusical='" + generoMusical + '\'' +
//               ", artista='" + artista + '\'' +
//               ", quantidadeEstoque=" + quantidadeEstoque +
//               '}';
//   }
}
