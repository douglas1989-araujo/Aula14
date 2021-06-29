package classes;

public class Livro {
  private String titulo;
  private String isbn;

  public Livro() {
  }

  public Livro(String titulo, String isbn) {
    setTitulo(titulo);
    setIsbn(isbn);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  // Dois livros são iguais quando seus ISBNs são iguais
  @Override
  public boolean equals(Object outroLivro) {
    // equals retorna true se 'outroLivro' for not null E ISBN == ISBN da instância
    boolean notNull = outroLivro != null; // se outroLivro não for nulo, notNull vale true
    boolean isbnIguais = getIsbn().equals(((Livro) outroLivro).getIsbn());
    
    return notNull && isbnIguais;
  }
}
