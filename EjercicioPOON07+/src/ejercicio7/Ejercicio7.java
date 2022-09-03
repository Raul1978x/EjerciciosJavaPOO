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
package ejercicio7;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author Samu Noah
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioPersona serv = new ServicioPersona();
   
        
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
               Persona p1 = serv.crearPersona();
                serv.calcularIMC(p1);
                serv.esMayorDeEdad(p1);
                serv.calcular(p1);

            } else if (i == 1) {
                Persona p2 = serv.crearPersona();
                serv.calcularIMC(p2);
                serv.esMayorDeEdad(p2);
                serv.calcular(p2);
            } else if (i == 2) {
                Persona p3 = serv.crearPersona();
                serv.calcularIMC(p3);
                serv.esMayorDeEdad(p3);
                serv.calcular(p3);
            } else {
                Persona p4 = serv.crearPersona();
                serv.calcularIMC(p4);
                serv.esMayorDeEdad(p4);
                serv.calcular(p4);
            }

        }

        serv.mostrar();
    }

}
