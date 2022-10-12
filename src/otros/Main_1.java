package otros;

import javax.swing.JOptionPane;

import Ejercicio_1.Automovil;

public class Main_1 {
    public static void main(String[] args){
        int elementos;
        Automovil[] autos;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de objetos"));

        autos = new Automovil[elementos];

        for (int i = 0; i < autos.length; i++) {
            JOptionPane.showMessageDialog(null, "Valores del auto: "+(i+1));
            autos[i]= solicitarInfo();
        }

        imprimir(autos);
    }

    public static Automovil solicitarInfo(){
        String nombre=JOptionPane.showInputDialog("Introduce el model del auto: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de cilindros: "));
        double gas= Double.parseDouble(JOptionPane.showInputDialog("Introduce los litros: "));

        Automovil obj = new Automovil(nombre, numero, gas);

        return obj;
    }

    public static void imprimir(Automovil[] argl){
        String cadena="";
        for (Automovil valor : argl) {
            cadena+="Automovil:\n"+valor.toString()+"\n\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
