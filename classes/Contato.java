package classes;

import java.util.Set;

public class Contato {
  private String nome;
  private Set<String> emails;
  private Telefone telefone;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<String> getEmails() {
    return emails;
  }

  public void setEmails(Set<String> emails) {
    this.emails = emails;
  }

  public Telefone getTelefone() {
    return telefone;
  }

  public void setTelefone(Telefone telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    String saida = "\nContato: " + getNome();
    saida = saida + "\nEmails: " + getEmails();
    saida = saida + "\nTelefone: " + getTelefone();

    return saida;
  }
}
