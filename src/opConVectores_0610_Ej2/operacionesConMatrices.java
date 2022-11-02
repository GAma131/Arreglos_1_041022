package opConVectores_0610_Ej2;

import javax.swing.JOptionPane;

public class operacionesConMatrices {

  private int tamano;
  private int[][] matriz;

  public operacionesConMatrices(int n) {
    matriz = new int[n][n];
    this.tamano = n;
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

  public int obtenerTamano() {
    return tamano * tamano;
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

  public void sumarMatriz() {
    int vector[] = convertirAVector();
    int suma = 0;
    for (int valor : vector) {
      suma += valor;
    }

    JOptionPane.showMessageDialog(null, "Valor suma: " + suma);
  }

  public int obtenerMaximo() {
    int vector[] = convertirAVector();
    int max = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] > max) {
        max = vector[i];
      }
    }
    return max;
  }

  public int obtenerMinimo() {
    int vector[] = convertirAVector();
    int min = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] < min) {
        min = vector[i];
      }
    }
    return min;
  }

  public void obtenerMedia() {
    int vector[] = convertirAVector();
    double media = 0;
    for (int valor : vector) {
      media += valor;
    }
    media /= vector.length;

    JOptionPane.showMessageDialog(null, "Valor media: " + media);
  }

  public void obtenerModa() {
    int vector[] = convertirAVector();
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

  public void ordenarBurbujaAsc() {
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

  public void ordenarBurbujaDesc() {
    int vector[] = convertirAVector();
    int aux = 0;
    int i = 0;
    int j = 0;
    int n = vector.length;
    do {
      j = 0;
      while (j < n - 1) {
        if (vector[j] < vector[j + 1]) {
          aux = vector[j];
          vector[j] = vector[j + 1];
          vector[j + 1] = aux;
        }
        j++;
      }
      i++;
    } while (i < n);
    convertirMatriz(vector);
  }

  public void ordenarSeleccion() {
    int vector[] = convertirAVector();
    int n = vector.length;
    int aux = n;
    for (int i = 0; i < n - 1; i++) {
      int minimo = i;
      for (int j = i + 1; j < n; j++) {
        if (vector[j] < vector[minimo]) {
          minimo = j;
        }
      }
      aux = vector[i];
      vector[i] = vector[minimo];
      vector[minimo] = aux;
    }
    convertirMatriz(vector);
  }

  public void ordenarInsercion() {
    int vector[] = convertirAVector();
    int n = vector.length;
    int aux = n;
    for (int i = 1; i < n; i++) {
      aux = vector[i];
      for (int j = i - 1; j >= 0 && vector[j] > aux; j--) {
        vector[j + 1] = vector[j];
        vector[j] = aux;
      }
    }
    convertirMatriz(vector);
  }

  public void ordenarShell() {
    int vector[] = convertirAVector();
    int n = vector.length;
    int aux;
    int salto = vector.length / 2;
    int j, k;

    while (salto > 0) {
      for (int i = salto; i < n; i++) {
        j = i - salto;
        while (j >= 0) {
          k = j + salto;
          if (vector[j] <= vector[k]) {
            j = -1;
          } else {
            aux = vector[j];
            vector[j] = vector[k];
            vector[k] = aux;
            j -= salto;
          }
        }
      }
      salto = salto / 2;
    }
    convertirMatriz(vector);
  }

  // todo: Resolver
  public void ordenarQuicksort(int izq, int der) {
    int vector[] = convertirAVector();
    int i, j, pivote, aux;
    i = izq;
    j = der;

    pivote = vector[(izq + der) / 2];
    do {
      while (vector[i] < pivote) {
        i++;
      }
      while (vector[j] > pivote) {
        j--;
      }
      if (i <= j) {
        aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
        i++;
        j--;
      }
    } while (i <= j);
    if (izq < j) {
      ordenarQuicksort(izq, j);
    }
    if (i < der) {
      ordenarQuicksort(i, der);
    }
    convertirMatriz(vector);
  }

  // ! METODOS DE BUSQUEDA

  public int busquedaSecuencial(int valor) {
    int vector[] = convertirAVector();
    for (int i = 0; i < vector.length; i++) {
      if (valor == vector[i]) {
        return i;
      }
    }
    convertirMatriz(vector);
    return -1;
  }

  public int busquedaBinaria(int valor) {
    int vector[] = convertirAVector();
    int n = vector.length;
    int centro, primero = 0, ultimo = n - 1;
    while (primero <= ultimo) {
      centro = (ultimo + primero) / 2;
      if (vector[centro] == valor) {
        return centro;
      } else if (valor < vector[centro]) {
        ultimo = centro - 1;
      } else {
        primero = centro + 1;
      }
    }
    convertirMatriz(vector);
    return -1;
  }

  // ! CONVERSIÓN
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
