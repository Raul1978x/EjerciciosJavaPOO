//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
String palabra = JOptionPane.showInputDialog("Ingrese Palabra a Buscar");
a1.setCantIntentos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de intentos")));

//        System.out.print("Ingrese Palabra a buscar: ");
//        String palabra = leer.next().toLowerCase();

//        System.out.print("Ingrese Cantidad de Intentos: ");
//        a1.setCantIntentos(leer.nextInt());

        a1.setCantEncontradas(0);
        String[] v = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
//            a1.getSolucion()[i] = "_";
            v[i] = palabra.substring(i, i + 1);
        }
        a1.setFaltantes(palabra.length());

        a1.setPalabra(v);

//            char[] vector = palabra.charAt(i);
//        
//        for (int i = 0; i < palabra.length(); i++) {
//            a1.getPalabra()[i] = palabra.substring(i, i + 1);
//            System.out.println(a1.getPalabra()[i]);
//        }
        return a1;
    }

    /**
     * Método longitud(): muestra la longitud de la palabra que se debe
     * encontrar.Nota: buscar como se usa el vector.length
     *
     * @param a1
     */
    public int longitud(Ahorcado a1) {
        //System.out.println("Longitud de palabra " + a1.getPalabra().length);

        return a1.getPalabra().length;
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. También informará
     * si la letra estaba o no.
     *
     * @param a1
     * @param letra
     */
    public int buscar(Ahorcado a1, String letra) {
        int cont = 0;
//        letra.subSequence(0, letra.length());

        for (int i = 0; i < longitud(a1); i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                cont++;
                a1.getPalabra()[i] = letra;
                char letter = letra.charAt(0);
//                System.out.println("");
//                System.out.println(letter);
                a1.getSolucion()[i]=letter;
            }
        }
        System.out.println("");
        if (cont == 0) {
            System.out.println("No se encontro la letra");
        } else {
            System.out.println("Se encontró la letra");
        }
        a1.setCantEncontradas(a1.getCantEncontradas() - cont);
        return cont;

    }//buscar

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     *
     * @param a1
     * @param letra
     * @return
     */
    public boolean encontradas(Ahorcado a1, String letra) {

        int cant = buscar(a1, letra);
        a1.setFaltantes(a1.getFaltantes() - cant);
        System.out.println("Faltan encontrar " + a1.getFaltantes() + " letras");

        return cant > 0;

    }

    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al
     * jugador.
     *
     * @param a1
     * @param letra
     * @return
     */
    public boolean intentos(Ahorcado a1, String letra) {

        if (!encontradas(a1, letra)) {
            a1.setCantIntentos(a1.getCantIntentos() - 1);
        }
        if (a1.getCantIntentos() == 0) {
            System.out.println("");
            System.out.println("PERDISTE!! LOOOOSER");
            return false;
        } else if(a1.getFaltantes()==0){
            System.out.println("");
            System.out.print("CONGRATULATION YOU ARE WINNER\n\nLa palabra secreta es: ");
            for (int i = 0; i < longitud(a1); i++) {
                System.out.print(a1.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
//System.out.println(Arrays.toString(a1.getPalabra()));
            return false;
        }else {
            System.out.println("Le quedan " + a1.getCantIntentos() + " intentos");
//            Arrays.toString(a1.getSolucion());
            return true;
        }

    }

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la
     * palabra o se quede sin intentos.Este método se llamará en el main.
     *
     * @param a1
     */
    public void juego(Ahorcado a1) {

// a1.equals(crearJuego());
        String letra;
        do {
            System.out.println("");
            for (int i = 0; i < longitud(a1); i++) {
                System.out.print(a1.getSolucion()[i]);
                System.out.print(" ");
            }
            System.out.println("");
            System.out.println("");
            System.out.print("Ingrese una letra: ");
            letra = leer.next();
            
        } while (intentos(a1, letra));

    }
}
