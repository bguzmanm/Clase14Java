import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> lista = new ArrayList<String>(List.of("Chile", "Perú"));

    lista.add("Bolivia");
    lista.add("Argentina");
    lista.add("Ecuador");
    lista.add("Venezuela");
    lista.add("Colombia");
    lista.add("Brasil");
    lista.add("Uruguay");
    lista.add("Paraguay");
    lista.add("Guyana");
    lista.add("Surinam");
    lista.add("Guyana Francesa");

    lista.add("Chile");
    System.out.println(lista.size());

    Collections.sort(lista, String.CASE_INSENSITIVE_ORDER);

    System.out.println(lista);

    Collections.reverse(lista);

    System.out.println(lista);

    System.out.println(Collections.frequency(lista, "Chile"));


  }

}