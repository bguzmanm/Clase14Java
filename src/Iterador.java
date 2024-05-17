import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<String>();

    lista.add("Primero");
    lista.add("Segundo");
    lista.add("Tercero");
    lista.add("Cuarto");
    lista.add("Quinto");

    for (String s : lista) {
      System.out.println(s);
    }

    for (Iterator<String> iterator = lista.iterator();iterator.hasNext();){

      String element = (String)iterator.next();


      System.out.println("El elemento es: " + element);

      iterator.remove();
    }

  }
}
