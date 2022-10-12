package Ejercicio_1;

import javax.swing.JOptionPane;

public class Ejer_1 {
    private int n;
    private int valor;

    public Ejer_1(int n) {
        this.n = n;
        valor = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n>=0?n:1;
    }


    public int solicitarInfo(){
        n=Integer.parseInt(JOptionPane.showInputDialog(null,""));
        return n;
    }
}
