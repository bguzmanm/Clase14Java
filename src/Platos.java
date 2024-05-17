import java.util.ArrayList;
import java.util.Collections;

public class Platos {
  public static void main(String[] args) {
    ordernar();
  }

  static void ordernar(){
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Cazuela");
    lista.add("Porotos");
    lista.add("Pastel de choclo");
    lista.add("Ají de gallina");
    lista.add("Ceviche");
    lista.add("Arepas");

    Collections.sort(lista);
    System.out.println("La lista de comidas es: " + lista);
  }

}
