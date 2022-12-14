package opConVectores_0610_Ej2;

import javax.management.openmbean.OpenDataException;
import javax.swing.JOptionPane;

/* Realizar un programa que utilice arregloso y realice lo siguiente:

    1). Llenar el arreglo de enteros.
    2). Imprima los valores.
    3). Sumar los elementos.
    4). Encontrar el valor máximo.
    5). Encontrar el valor mínimo.
    6). Mostrar el tamaño del arreglo.
    7). Salir.

    8). Obtener la media aritmetica de los valores.
    9). obtener la moda de los números.

    PASOS A SEGUIR:
    1). Definir el tamaño del arreglo.
    2). Llenar el arreglo.
*/

public class Main_panelPrincipal {

  public static void main(String[] args) {
    crearMenuPrincipal();
  }

  public static void crearMenuPrincipal() {
    Boolean sentinel = true;
    String menu;
    String opcion;

    menu =
      "Menu Principal\n" +
      "1) Vectores\n" +
      "2) Matrices\n" +
      "b) Salir\n\n" +
      "Selecciona una opción valida:";
    do {
      opcion = JOptionPane.showInputDialog(menu);

      switch (opcion) {
        case "1":
          crearMenuVectores();
          break;
        case "2":
          crearMenuMatrices();
          break;
        case "b":
          sentinel = false;
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción no valida!");
          break;
      }
    } while (sentinel);
  }

  public static void crearMenuVectores() {
    boolean sentinel = true;
    String menu;
    String opcion;
    String n;
    int tamano;

    do {
      n = JOptionPane.showInputDialog("Introduce el tamaño del arreglo: ");
      if (validarN(n)) {
        tamano = Integer.parseInt(n);
        if (tamano > 0) {
          break;
        } else {
          JOptionPane.showMessageDialog(
            null,
            "El tamaño no puede ser 0 o negativo!"
          );
        }
      } else {
        JOptionPane.showMessageDialog(null, "El valor debe ser un entero!");
      }
    } while (true);

    operacionesConVectores obj = new operacionesConVectores(tamano);

    menu =
      "Menu Principal VECTORES\n" +
      "1) Llenar vector\n" +
      "2) Imprimir valores\n" +
      "3) Sumar los elementos\n" +
      "4) Valor máximo y mínimo\n" +
      "5) Tamaño del arreglo\n" +
      "6) Media aritmetica\n" +
      "7) Obtener Moda\n" +
      "8) Ordenamiento burbuja (Ascendente)\n" +
      "9) Ordenamiento burbuja (Descendente)\n" +
      "10) Busqueda Secuencial\n" +
      "11) Ordenar Selección\n" +
      "12) Ordenar Inserción\n" +
      "13) Ordenar Shell\n" +
      "14) Ordenar Quicksort\n" +
      "15) Busqueda Binaria\n" +
      "b) Regresar\n\n" +
      "Selecciona una opción valida:";

    do {
      opcion = JOptionPane.showInputDialog(menu);

      switch (opcion) {
        case "1":
          obj.llenarArreglo(solicitarValores(tamano));
          break;
        case "2":
          obj.Imprimir();
          break;
        case "3":
          obj.sumarVector();
          break;
        case "4":
          JOptionPane.showMessageDialog(
            null,
            "Valor Máximo: " +
            obj.obtenerMaximo() +
            "\nValor Minimo: " +
            obj.obtenerMinimo()
          );
          break;
        case "5":
          JOptionPane.showMessageDialog(
            null,
            "Tamaño del arreglo: " + obj.obtenerTamano()
          );
          break;
        case "6":
          obj.obtenerMedia();
          break;
        case "7":
          obj.obtenerModa();
          break;
        case "8":
          obj.ordenarBurbujaAsc();
          break;
        case "9":
          obj.ordenarBurbujaDesc();
          break;
        case "10":
          String valor = "";
          do {
            valor =
              JOptionPane.showInputDialog(
                "Ingrese el numero que quiere buscar: "
              );
          } while (!validarN(valor));
          int p = obj.busquedaSecuencial(Integer.parseInt(valor));
          if (p == -1) {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda secuencial no encontró el valor solicitado"
            );
          } else {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda secuencial encontro el valor solicitado en la posicion " +
              "[" +
              obj.busquedaSecuencial(Integer.parseInt(valor)) +
              "]"
            );
            obj.Imprimir();
          }
          break;
        case "11":
          obj.ordenarSeleccion();
          obj.Imprimir();
          break;
        case "12":
          obj.ordenarInsercion();
          obj.Imprimir();
          break;
        case "13":
          obj.ordenarShell();
          obj.Imprimir();
          break;
        case "14":
          obj.ordenarQuicksort(0, tamano - 1);
          obj.Imprimir();
          break;
        case "15":
          obj.ordenarBurbujaAsc();
          valor = "";
          do {
            valor =
              JOptionPane.showInputDialog("Introduce el numero a buscar: ");
          } while (!validarN(valor));
          p = obj.busquedaBinaria(Integer.parseInt(valor));
          if (p != -1) {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda se encontro en la posicion: " + p
            );
          } else {
            JOptionPane.showMessageDialog(null, "La busqueda no se encontro");
          }
          obj.Imprimir();
          break;
        case "b":
          sentinel = false;
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción no valida!");
          break;
      }
    } while (sentinel);
  }

  public static void crearMenuMatrices() {
    boolean sentinel = true;
    String menu;
    String opcion;
    String n;
    int tamano;

    do {
      n = JOptionPane.showInputDialog("Introduce el tamaño del arreglo: ");
      if (validarN(n)) {
        tamano = Integer.parseInt(n);
        if (tamano > 0) {
          break;
        } else {
          JOptionPane.showMessageDialog(
            null,
            "El tamaño no puede ser 0 o negativo!"
          );
        }
      } else {
        JOptionPane.showMessageDialog(null, "El valor debe ser un entero!");
      }
    } while (true);

    operacionesConMatrices obj1 = new operacionesConMatrices(tamano);

    menu =
      "Menu Principal MATRICES\n" +
      "1) Llenar Matriz\n" +
      "2) Imprimir valores\n" +
      "3) Sumar los elementos\n" +
      "4) Valor máximo y mínimo\n" +
      "5) Tamaño del arreglo\n" +
      "6) Media aritmetica\n" +
      "7) Obtener Moda\n" +
      "8) Ordenamiento burbuja (Ascendente)\n" +
      "9) Ordenamiento burbuja (Descendente)\n" +
      "10) Ordenar Selección\n" +
      "11) Ordenar Inserción\n" +
      "12) Ordenar Shell\n" +
      "13) Ordenar Quicksort\n" +
      "14) Busqueda Secuencial\n" +
      "15) Busqueda Binaria\n" +
      "b) Regresar\n\n" +
      "Selecciona una opción valida:";

    do {
      opcion = JOptionPane.showInputDialog(menu);

      switch (opcion) {
        case "1":
          obj1.llenarMatriz(solicitarvaloresMatriz(tamano));
          break;
        case "2":
          obj1.ImprimirMatriz();
          break;
        case "3":
          obj1.sumarMatriz();
          break;
        case "4":
          JOptionPane.showMessageDialog(
            null,
            "Valor Máximo: " +
            obj1.obtenerMaximo() +
            "\nValor Minimo: " +
            obj1.obtenerMinimo()
          );
          break;
        case "5":
          JOptionPane.showMessageDialog(
            null,
            "Tamaño del arreglo: " + obj1.obtenerTamano()
          );
          break;
        case "6":
          obj1.obtenerMedia();
          break;
        case "7":
          obj1.obtenerModa();
          break;
        case "8":
          obj1.ordenarBurbujaAsc();
          obj1.ImprimirMatriz();
          break;
        case "9":
          obj1.ordenarBurbujaDesc();
          obj1.ImprimirMatriz();
          break;
        case "10":
          obj1.ordenarSeleccion();
          obj1.ImprimirMatriz();
          break;
        case "11":
          obj1.ordenarInsercion();
          obj1.ImprimirMatriz();
          break;
        case "12":
          obj1.ordenarShell();
          obj1.ImprimirMatriz();
          break;
        case "13":
          // todo: Resolver QuickSort
          obj1.ordenarQuicksort(0, tamano - 1);
          obj1.ImprimirMatriz();
          break;
        case "14":
          String valor = "";
          do {
            valor =
              JOptionPane.showInputDialog(
                "Ingrese el numero que quiere buscar: "
              );
          } while (!validarN(valor));
          int p = obj1.busquedaSecuencial(Integer.parseInt(valor));
          if (p == -1) {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda secuencial no encontró el valor solicitado"
            );
          } else {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda secuencial encontro el valor solicitado en la posicion " +
              "[" +
              obj1.busquedaSecuencial(Integer.parseInt(valor)) +
              "]"
            );
            obj1.ImprimirMatriz();
          }
          break;
        case "15":
          obj1.ordenarBurbujaAsc();
          valor = "";
          do {
            valor =
              JOptionPane.showInputDialog("Introduce el numero a buscar: ");
          } while (!validarN(valor));
          p = obj1.busquedaBinaria(Integer.parseInt(valor));
          if (p != -1) {
            JOptionPane.showMessageDialog(
              null,
              "La busqueda se encontro en la posicion: " + p
            );
          } else {
            JOptionPane.showMessageDialog(null, "La busqueda no se encontro");
          }
          obj1.ImprimirMatriz();
          break;
        case "b":
          sentinel = false;
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción no valida!");
          break;
      }
    } while (sentinel);
  }

  public static int[] solicitarValores(int tamano) {
    int[] arg = new int[tamano];
    String valor = "";

    for (int i = 0; i < arg.length; i++) {
      do {
        valor = JOptionPane.showInputDialog("Introduce el Número " + (i + 1));
      } while (!validarN(valor));
      arg[i] = Integer.parseInt(valor);
    }
    return arg;
  }

  public static int[][] solicitarvaloresMatriz(int tam) {
    int arr[][] = new int[tam][tam];
    String valor;

    int fila = 0;
    while (fila < arr.length) {
      for (int columna = 0; columna < arr.length; columna++) {
        do {
          valor =
            JOptionPane.showInputDialog(
              "introduce el valor de la posicion ( " +
              (fila + 1) +
              " , " +
              (columna + 1) +
              " )"
            );
        } while (!validarN(valor));
        arr[fila][columna] = Integer.parseInt(valor);
      }
      fila++;
    }
    return arr;
  }

  public static boolean validarN(String n) {
    try {
      Integer.parseInt(n);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
