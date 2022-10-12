package otros;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros;
        numeros= new int [5];

        double xyz[]={4,5,6,7,8,12};

        boolean[] valores;
        valores = new boolean[10];

        String [] nombres = new String[4];

        int tamanio= numeros.length;
        System.out.println(numeros[0]);

        System.out.println(nombres[nombres.length-1]);

        for (int i = 0; i < xyz.length; i++) {
            System.out.println(xyz[i]);
        }
    }
}
