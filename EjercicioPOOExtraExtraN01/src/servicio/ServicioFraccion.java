/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
 * fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
 * fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package servicio;

import entidad.Fraccion;

public class ServicioFraccion {



    public Fraccion maxComunMultiplo() {
    Fraccion fr = new Fraccion(5, 10,10,5);
        int u1 = Math.abs(fr.getNum1());
        int v1 = Math.abs(fr.getDen1());
        int u2 = Math.abs(fr.getNum2());
        int v2 = Math.abs(fr.getDen2());
        if (v1 == 0) {
//            return u1;
            System.out.println(u1);
        }
        int r1;
        while (v1 != 0) {
            r1 = u1 % v1;
            u1 = v1;
            v1 = r1;
//            return u1;
            System.out.println(u1);

        }
        if (v2 == 0) {
//            return u2;
            System.out.println(u2);

        }
        int r2;
        while (v2 != 0) {
            r2 = u2 % v2;
            u2 = v2;
            v2 = r2;
        }
//        return u2;
            System.out.println(u2);
            return fr;
    }
}
//  private int mcd(fraccion fr){
//     int u=Math.abs(num);
//     int v=Math.abs(den);
//     if(v==0){
//          return u;
//     }
//     int r;
//     while(v!=0){
//          r=u%v;
//          u=v;
//          v=r;
//     }
//     return u;
//  }
//  public Fraccion simplificar(){
//     int dividir=mcd();
//     num/=dividir;
//     den/=dividir;
//     return this;
