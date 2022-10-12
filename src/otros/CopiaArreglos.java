package otros;



public class CopiaArreglos {
    public static void main(String[] args) {
        int n[]=new int[5];
        int x[];

        n[0]=10;
        n[1]=15;
        n[2]=33;
        n[3]=22;
        n[4]=12;

        x=n;

        System.out.println(n[0]);
        System.out.println(x[0]);

        x[0] = 90;

        System.out.println(n[0]);
    }
}
