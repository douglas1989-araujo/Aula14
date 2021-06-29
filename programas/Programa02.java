package programas;

import java.util.Scanner;

import classes.Livro;

public class Programa02 {
  public static void main(String[] args) {
    final int MAX_LIVROS = 3;
    Livro[] livros = new Livro[MAX_LIVROS];

    livros[0] = new Livro("O nome da rosa", "2983728937");
    livros[1] = new Livro("Dançando sobre cacos de vidro", "1234");

    int qtdLivros = 2;

    Scanner sc = new Scanner(System.in);

    // 1 - Descobrir qual livro ele quer buscar.
    System.out.print("ISBN a buscar: ");
    Livro livroBusca = new Livro("", sc.nextLine());

    // System.out.println(isbn);//Se exibir o mesmo q digitei, blz, vi que está OK o
    // problema 1!!

    // 2 - Procurar no vetor o livro informado
    // 2.1 - Percorrer o vetor até o fim ou até achar
    Livro livroEncontrado = null;
    for (int i = 0; livroEncontrado != null && i < qtdLivros; i++) {
      if(livroBusca.equals(livros[i])) {
      livroEncontrado = livros[i];
      }
    }
    // System.out.println("Achou: " + achou); //Se printou true é pq achou.

    // 2.2 - SE ACHOU O LIVRO, exibe seu título. SE NÃO, informa que não achou
    if (livroEncontrado != null) {
      System.out.printf("Livro de ISBN %s: %s\n", livroEncontrado.getIsbn(), livroEncontrado.getTitulo());
    } else {
      System.out.println("Livro não encontrado!");
    }

    sc.close();
  }
}
