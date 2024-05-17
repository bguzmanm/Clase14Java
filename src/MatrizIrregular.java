public class MatrizIrregular {
  public static void main(String[] args) {


    int[][] matriz = {{1, 2, 3}, {4,3,2}, {5,6,2}};


    for (int i = 0; i < matriz.length; i++) {
      //for (int j = 0; j < matriz[i].length; j++) {
        System.out.println(matriz[i][0] + "\t");
      //}
    }
    for (int i = 0; i < matriz.length; i++) {
      //for (int j = 0; j < matriz[i].length; j++) {
        System.out.println(matriz[0][i] + "\t");
      //}
    }



  }
}
