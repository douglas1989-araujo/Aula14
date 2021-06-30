package programas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {
    Map<Integer, String> mapa = new HashMap<>();

    mapa.put(1, "Leandro");
    mapa.put(2, "Maria Joaquina");
    mapa.put(3, "Professora Elena");

    System.out.println(mapa);

    mapa.put(1, "Pedrinho");

    System.out.println(mapa);

    // Esvazia o mapa
    mapa.clear();

    mapa.put(1, "Pessoal");
    mapa.put(2, "Profissional");

    System.out.println("Tipos de telefone:");

    for (int chave : mapa.keySet()) {
      System.out.printf("Chave %d => valor %s\n", chave, mapa.get(chave));
    }
  }
}
