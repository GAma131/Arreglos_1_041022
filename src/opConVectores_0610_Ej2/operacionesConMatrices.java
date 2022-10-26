package opConVectores_0610_Ej2;

import javax.swing.JOptionPane;

public class operacionesConMatrices {

  private int[][] matriz;

  public operacionesConMatrices(int n) {
    matriz = new int[n][n];
  }

  public operacionesConMatrices(int fila, int columna) {
    matriz = new int[fila][columna];
  }

  public void llenarMatriz(int[][] matriz) {
    for (int fila = 0; fila < matriz.length; fila++) {
      int columna = 0;
      while (columna < matriz.length) {
        this.matriz[fila][columna] = matriz[fila][columna];
        columna++;
      }
    }
  }

  public void ImprimirMatriz() {
    int fila = 0;
    String cadena = "";
    do {
      int columna = 0;
      while (columna < matriz.length) {
        cadena += matriz[fila][columna] + " | ";
        columna++;
      }
      cadena += "\n";
      fila++;
    } while (fila < matriz.length);
    JOptionPane.showMessageDialog(null, "cadena es \n" + cadena);
  }

  public void ordenarBurbuja() {
    int arr[] = convertirAVector();
    int aux = 0;
    int i = 0;
    int j = 0;
    int n = arr.length;
    do {
      j = 0;
      while (j < n - 1) {
        if (arr[j] > arr[j + 1]) {
          aux = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = aux;
        }
        j++;
      }
      i++;
    } while (i < n);
    convertirMatriz(arr);
  }

  private int[] convertirAVector() {
    int tam = matriz.length * matriz[0].length;
    int arr[] = new int[tam];
    int aux = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        arr[aux] = matriz[i][j];
        aux++;
      }
    }
    return arr;
  }

  private void convertirMatriz(int[] arr) {
    int aux = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = arr[aux];
        aux++;
      }
    }
  }
}
