/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
 *  @author elias
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] vector;
        System.out.println("Cuantas Personas Son");
        int resp = leer.nextInt();
        vector = new int [resp];
        altura(vector);
    }
    public static void altura(int [] vector){
        Scanner alt = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("Cual es la altura en Cm y sin puntos, de la persona [" + i + "]");
            int num = alt.nextInt();
            vector[i] = num;
        }
        int prom160 = 0;
        int cont160 = 0;
        int promgral = 0;
        int contgral = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] < 160){
                prom160 += vector[i];
                cont160 += 1;
            }else{
                promgral += vector[i];
                contgral += 1;
            }
        }
        System.out.println("La estatura  promedio debajo de los 1.60 es: " + prom160/cont160 + "cm");
        System.out.println("La estatura promedio general es: " + promgral/contgral + "cm");
    }}
