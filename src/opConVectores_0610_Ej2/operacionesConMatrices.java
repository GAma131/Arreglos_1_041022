package opConVectores_0610_Ej2;

import javax.swing.JOptionPane;

public class operacionesConMatrices {

  private int tamano;
  private int[][] matriz;

  public operacionesConMatrices(int n) {
    matriz = new int[n][n];
    this.tamano = n;
  }

  public int obtenerTamano() {
    return tamano;
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

  // ! OPERACIONES CON MATRICES

  int vector[] = convertirAVector();

  public void sumarMatriz() {
    int suma = 0;
    for (int valor : vector) {
      suma += valor;
    }

    JOptionPane.showMessageDialog(null, "Valor suma: " + suma);
  }

  public int obtenerMaximo() {
    int max = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] > max) {
        max = vector[i];
      }
    }
    return max;
  }

  public int obtenerMinimo() {
    int min = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] < min) {
        min = vector[i];
      }
    }
    return min;
  }

  public void obtenerMedia() {
    double media = 0;
    for (int valor : vector) {
      media += valor;
    }
    media /= vector.length;

    JOptionPane.showMessageDialog(null, "Valor media: " + media);
  }

  public void obtenerModa() {
    int maximoNumRepeticiones = 0;
    int moda = 0;

    for (int i = 0; i < vector.length; i++) {
      int numRepeticiones = 0;
      for (int j = 0; j < vector.length; j++) {
        if (vector[i] == vector[j]) {
          numRepeticiones++;
        } //fin if
        if (numRepeticiones > maximoNumRepeticiones) {
          moda = vector[i];
          maximoNumRepeticiones = numRepeticiones;
        } //fin if
      }
    } //fin for
    JOptionPane.showMessageDialog(null, "Número que más se repite: " + moda);
  }

  // ! METODOS DE ORDENAMIENTO
  int arr[] = convertirAVector();

  public void ordenarBurbuja() {
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
