/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package entidad;

import java.util.Scanner;

public class Cadena {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud() {
        this.longitud = this.frase.length();
    }

    public int mostrarVocales(Cadena c) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if ("a".equalsIgnoreCase(frase.substring(i, i + 1)) || "e".equalsIgnoreCase(frase.substring(i, i + 1)) || "i".equalsIgnoreCase(frase.substring(i, i + 1)) || "o".equalsIgnoreCase(frase.substring(i, i + 1)) || "u".equalsIgnoreCase(frase.substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("la cantidad de vocales es: " + cont);
        return cont;
    }

    public void invertirFrase(Cadena c) {
        String letra = "";
        System.out.print("la palabra al reves es: ");
        for (int i = 1; i <= frase.length(); i++) {
            letra = frase.substring(frase.length() - i, ((frase.length() - i) + 1));
            System.out.print(letra);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c) {

        System.out.println("Ingrese una letra");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra.equalsIgnoreCase(frase.substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("El caráter " + letra + " se repite " + cont + " veces.");
    }

    public void compararLongitud(String frase) {
        System.out.println("Ingrese una nueva frase");
        String nuevaFrase = leer.next();
        if (nuevaFrase.length() == frase.length()) {
            System.out.println("Ambas frases tienen la misma cantidad de caracteres");
        } else if (nuevaFrase.length() > frase.length()) {
            System.out.println("la nueva frase tiene mas caracteres que la anterior");
        } else {
            System.out.println("la frase tiene mas caracteres que la nueva frase");
        }
    }

    public void unirFrases(String frase) {
        System.out.println("Ingrese una nueva frase");
        String nuevaFrase = leer.next();
        System.out.println(this.frase + " " + nuevaFrase);
    }

    public void reemplazar(String letra) {
        String reemplazo = letra.replaceAll("a", "4");
        System.out.println(reemplazo);
    }
    public void contiene(Cadena c) {
        int contiene = 0;
        System.out.println("Ingrese una letra");
        String letra = leer.next();

        for (int i = 0; i < frase.length(); i++) {
            if (letra.equalsIgnoreCase(frase.substring(i, i + 1))) {
                contiene++;
            }
        }
        if (contiene > 0) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}
