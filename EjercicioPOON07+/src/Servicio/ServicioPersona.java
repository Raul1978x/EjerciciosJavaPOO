/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Samu Noah
 */
public class ServicioPersona {

    public int pesoBajo = 0;
    public int pesoAlto = 0;
    public int pesoIdeal = 0;
    public int mayorE = 0;
    public int menorE = 0;

    public int getPesoBajo() {
        return pesoBajo;
    }

    public int getPesoAlto() {
        return pesoAlto;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public int getMayorE() {
        return mayorE;
    }

    public int getMenorE() {
        return menorE;
    }
    
    

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("ingrese nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        System.out.println("ingrese el sexo de la persona");
        System.out.println("ingrese M - H - O para identificar");
        do {
            p1.setSexo(leer.next());
            if (!p1.getSexo().equalsIgnoreCase("h") && !p1.getSexo().equalsIgnoreCase("m") && !p1.getSexo().equalsIgnoreCase("o")) {
                System.out.println("ingrese un valor correcto");
            } else {
                break;
            }
        } while (true);
        System.out.println("ingrese el peso de la persona");
        p1.setPeso(leer.nextDouble());
        System.out.println("ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public void calcularIMC(Persona p1) {
        int calculo = (int) (p1.getPeso() / (Math.pow(p1.getAltura(), 2)));
        p1.setImc(calculo);
        if (calculo < 20) {
            p1.setImc(-1);
        } else if (calculo < 25) {
            p1.setImc(0);
        } else {
            p1.setImc(1);
        }
    }

    public boolean esMayorDeEdad(Persona p1) {
        if (p1.getEdad() > 18) {
            p1.setMayor(true);
        }

        return p1.getMayor();
    }

    public void calcular(Persona p1) {
        if (p1.getImc() == -1) {
            this.pesoBajo++;
        } else if (p1.getImc() == 0) {
            this.pesoIdeal++;
        } else {
            this.pesoAlto++;
        }
        if (p1.getMayor() == true) {
            this.mayorE++;
        } else {
            this.menorE++;
        }
    }

    public void mostrar() {
        ServicioPersona sp = new ServicioPersona();
        
        double algo = (double)mayorE / 4*100 ;
        double cosa = (double) menorE / 4*100 ;
       
        System.out.println("porcentaje de personas por debajo del peso " + (double)pesoBajo / 4 * 100 + " %");
        System.out.println("porcentaje de personas por ideal del peso " + (double)pesoIdeal / 4 * 100 + " %");
        System.out.println("porcentaje de personas por sobrepeso del peso " + (double)pesoAlto / 4 * 100 + " %");
        System.out.println("porcentaje de personas menores de edad es " + algo + " %");
        System.out.println("porcentaje de personas mayores de edad es " +  cosa + " %");
       
        
        
    }

    
}
