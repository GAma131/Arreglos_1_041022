package opConVectores_0610_Ej2;

import javax.swing.JOptionPane;

public class operacionesConVectores {

  private int tamano;
  private int[] vector;

  public operacionesConVectores(int n) {
    vector = new int[n];
    this.tamano = n;
  }

  public int obtenerTamano() {
    return tamano;
  }

  public int[] getVector() {
    return vector;
  }

  public void llenarArreglo(int[] args) {
    int i = 0;
    while (i < args.length) {
      vector[i] = args[i];
      i++;
    }
  }

  public void Imprimir() {
    String cadena = "";
    for (int valor : vector) {
      cadena += valor + "\n";
    }

    JOptionPane.showMessageDialog(null, cadena);
  }

  public void sumarVector() {
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
    JOptionPane.showMessageDialog(null, "Moda del conjunto: " + moda);
  }
}
