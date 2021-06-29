package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Livro;

public class Programa03 {
  public static void main(String[] args) {
    List<Livro> livros = new ArrayList<>();

    livros.add(new Livro("O nome da rosa", "2983728937"));
    livros.add(new Livro("Dançando sobre cacos de vidro", "1234"));

    Scanner sc = new Scanner(System.in);

    // 1 - Descobrir qual livro ele quer buscar.
    System.out.print("ISBN a buscar: ");
    Livro livroBusca = new Livro("", sc.nextLine());

    // System.out.println(isbn);//Se exibir o mesmo q digitei, blz, vi que está OK o
    // problema 1!!

    // 2 - Procurar no vetor o livro informado
    // 2.1 - Percorrer o vetor até o fim ou até achar
    int posicaoLivro = livros.indexOf(livroBusca);

    // System.out.println("Achou: " + achou); //Se printou true é pq achou.

    // 2.2 - SE ACHOU O LIVRO, exibe seu título. SE NÃO, informa que não achou
    if (posicaoLivro > -1) {
      Livro livroEncontrado = livros.get(posicaoLivro);
      System.out.printf("Livro de ISBN %s: %s\n", livroEncontrado.getIsbn(), livroEncontrado.getTitulo());
    } else {
      System.out.println("Livro não encontrado!");
    }

    sc.close();
  }
}
