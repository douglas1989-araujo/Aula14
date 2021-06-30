package classes;

public class Telefone {
  private String numero;
  private String tipo;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
   return String.format("%s (%s)", getNumero(), getTipo());
  }
}
