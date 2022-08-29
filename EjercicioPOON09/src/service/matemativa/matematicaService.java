package service.matemativa;

import entidades.Matematica;
import java.util.Scanner;

import static java.lang.Math.abs;

public class matematicaService {
    Matematica m1 = new Matematica();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int mayor, menor;
    public void cargaNum (Matematica m){
        m1.setN1((int)(Math.random()*10+1));
        m1.setN2((int)(Math.random()*10+1));
    }
     public int devolverMayor(){
         
         if(m1.getN1()< m1.getN2()){
             mayor = m1.getN2();
             menor = m1.getN1();
         }else {
             mayor = m1.getN1();
             menor = m1.getN2();
         }
         System.out.println("mayor: "+mayor+"\nmenor: "+menor);
         return mayor;
     }
     public int calcularPotencia(){
         int pot;
         pot = (int)(Math.pow(mayor, menor));
         return pot;
     }
     public double calcularRaiz(){
         double raiz= (double)(Math.sqrt (abs(menor)));
         return raiz;
     }
}
