package Ejercicio_1;

public class Automovil {

    private String modelo;
    private int cilindros;
    private double litros;

    public Automovil(String modelo, int cilindros, double litros) {
        this.modelo = modelo;
        setCilindros(cilindros);
        setLitros(litros);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros>=0?cilindros:3;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros>=0?litros:1;
    }

    @Override
    public String toString() {
        return "Model: "+modelo+"\nNúmero de cilindros: "+cilindros+"\nLitros de gasolina: "+litros;
    }
}
