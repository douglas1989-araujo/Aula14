package programas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import classes.Contato;
import classes.Telefone;

public class Agenda {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int opcao;
    final Map<Integer, String> tiposTelefone = new HashMap<>();
    tiposTelefone.put(1, "Pessoal");
    tiposTelefone.put(2, "Profissional");

    // Defino a estrutura de dados que vai armazenar os contatos
    final List<Contato> contatos = new ArrayList<>();

    do {
      System.out.println("1 - Cadastrar contato");
      System.out.println("2 - Listar contatos");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      opcao = sc.nextInt();

      sc.nextLine(); // Tira o ENTER

      switch (opcao) {
        case 1:
          Contato cont = new Contato();

          System.out.print("Nome: ");
          cont.setNome(sc.nextLine());

          String email;
          Set<String> emails = new HashSet<>();

          do {
            System.out.print("Email (digite 'fim' para encerrar): ");
            email = sc.nextLine();

            if (!email.equals("fim")) {
              emails.add(email);
            }
          } while (!email.equals("fim"));

          cont.setEmails(emails);

          Telefone tel = new Telefone();
          System.out.print("Telefone: ");
          tel.setNumero(sc.nextLine());

          System.out.printf("Tipo de telefone (%s): ", tiposTelefone.toString());
          int codigoTipoTelefone = sc.nextInt();
          String tipoTelefone = tiposTelefone.get(codigoTipoTelefone);

          tel.setTipo(tipoTelefone);

          cont.setTelefone(tel);

          contatos.add(cont);

          System.out.println("Contato adicionado com sucesso.");
          break;
        case 2:
          if (contatos.isEmpty()) {
            System.out.println("Nenhum contato a exibir.");
            continue;
          }

          for (Contato contato : contatos) {
            System.out.println();
            System.out.println("Contato: " + contato.getNome());
            System.out.println("Emails: " + contato.getEmails());
            System.out.println("Telefone: " + contato.getTelefone());
          }
          break;
        case 0:
          System.out.println("Fim do programa.");
          break;
        default:
          System.out.println("opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }

}