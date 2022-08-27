/*
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

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    Persona pBase = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("nombre: ");
        pBase.setNombre(leer.next());
        System.out.println("edad: ");
        pBase.setEdad(leer.nextInt());
        System.out.println("Sexo(H-hombre / M-mujer / O-otro): ");
        do {
            pBase.setSexo(leer.next());
            if (!pBase.getSexo().equalsIgnoreCase("h") && !pBase.getSexo().equalsIgnoreCase("m") && !pBase.getSexo().equalsIgnoreCase("o")) {
                System.out.println("Ingrese correctamente el sexo(H-hombre / M-mujer / O-otro): ");
            }
        } while (!pBase.getSexo().equalsIgnoreCase("h") && !pBase.getSexo().equalsIgnoreCase("m") && !pBase.getSexo().equalsIgnoreCase("o"));
        System.out.println("peso: ");
        pBase.setPeso(leer.nextDouble());
        System.out.println("altura: ");
        pBase.setAltura(leer.nextDouble());
        return pBase;
    }

    public int calcularIMC(Persona p) {
       
        int imc = (int) (pBase.getPeso() / (pBase.getAltura() * pBase.getAltura()));
        p.setImc(imc);
        
        
        imc = (int) imc;
       
        if (imc < 20) {

//            p.setImc(-1);
//        } else if (imc <= 25) {
//            p.setImc(0);
//        } else {
//            p.setImc(1);
        }
        return p.getImc();
//(p.getImc());
    }

    public boolean esMayorDeEdad(Persona p) {

        if (pBase.getEdad() > 18) {
            p.setMayor(true);
        }
        return p.getMayor();
    }
}
