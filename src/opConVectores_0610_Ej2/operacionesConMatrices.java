package opConVectores_0610_Ej2;

import javax.swing.JOptionPane;

public class operacionesConMatrices {

  private int[][] matriz;

  public operacionesConMatrices(int n) {
    matriz = new int[n][n];
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
        cadena += matriz[fila][columna] + " ";
      }
      cadena += "\n";
      fila++;
    } while (fila < matriz.length);
    JOptionPane.showMessageDialog(null, cadena);
  }
}
