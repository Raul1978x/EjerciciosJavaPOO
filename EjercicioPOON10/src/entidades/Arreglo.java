package entidades;

public class Arreglo {

    private int[] arreglo1 = new int[50];
    private int[] arreglo2 = new int[20];

    public Arreglo() {
    }

    public int[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(int[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public int[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(int[] arreglo2) {
        this.arreglo2 = arreglo2;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo1=" + arreglo1 + ", arreglo2=" + arreglo2 + '}';
    }

    public void llenarArreglo() {
        System.out.println("arreglo 1");
        for (int i = 0; i < 50; i++) {
            arreglo1[i] = (int) (Math.random() * 200 - 100);
            System.out.print(" |" + arreglo1[i] + "| ");
        }
        System.out.println("");
        System.out.println("arreglo 2");
        for (int i = 0; i < 20; i++) {
            arreglo2[i] = (int) (Math.random() * 200 - 100);
            System.out.print(" |" + arreglo2[i] + "| ");
        }
    }

}
