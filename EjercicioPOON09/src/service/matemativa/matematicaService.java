package service.matemativa;

import entidades.Matematica;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class matematicaService {

    Matematica m1 = new Matematica();
    int mayor, menor;

    public void cargaNum(Matematica m) {
        m1.setN1((int) (Math.random() * 10 + 1));
        m1.setN2((int) (Math.random() * 10 + 1));
    }

    public int devolverMayor() {
        mayor = max(m1.getN1(), m1.getN2());
        menor = min(m1.getN1(), m1.getN2());
        System.out.println("mayor: " + mayor + "\nmenor: " + menor);
        return mayor;
    }

    public int calcularPotencia() {
        return (int) (Math.pow(mayor, menor));
    }

    public double calcularRaiz() {
        return (double) (Math.sqrt(abs(menor)));
    }
}
