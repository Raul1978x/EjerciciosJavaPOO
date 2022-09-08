/**
 * 4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
 * correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
 * (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 * • Métodos getters y setters para el número de DNI y la letra.
 * • Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
 * corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
 * resultado del calculo.
 * • Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
 * mayúscula; por ejemplo: 00395469-F).
 * La letra correspondiente al dígito verificador se calculará a traves de un método que
 * funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
 * de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
 * un array (vector) de caracteres la posición que corresponda al resto de la división para
 * obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * POSICIÓN LETRA
 * 0    T
 * 1    R
 * 2    W
 * 3    A
 * 4    G
 * 5    M
 * 6    Y
 * 7    F
 * 8    P
 * 9    D
 * 10   X
 * 11   B
 * 12   N
 * 13   J
 * 14   Z
 * 15   S
 * 16   Q
 * 17   V
 * 18   H
 * 19   L
 * 20   C
 * 21   K
 * 22   E
 */
package serviceNif;

import entidades.Nif;
import java.util.Arrays;
import java.util.Scanner;

public class ServiceNif {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * • Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá. Una vez calculado, le asigna la letra que le
     * corresponde según el resultado del calculo.
     */
    public Nif crearNif(){
        Nif nif = new Nif();
        Arrays.binarySearch(nif.getLetra(), 5);
        System.out.println("Ingrese su DNI:");
        nif.setDni(leer.nextLong());
        
        int calculo = (int)nif.getDni()%23;
        
        switch (calculo){
            case 0:
                nif.setLetra("T");
                break;
            case 1:
                nif.setLetra("R");
                break;
            case 2:
                nif.setLetra("W");
                break;
            case 3:
                nif.setLetra("A");
                break;
            case 4:
                nif.setLetra("G");
                break;
            case 5:
                nif.setLetra("M");
                break;
            case 6:
                nif.setLetra("Y");
                break;
            case 7:
                nif.setLetra("F");
                break;
            case 8:
                nif.setLetra("P");
                break;
            case 9:
                nif.setLetra("D");
                break;
            case 10:
                nif.setLetra("X");
                break;
            case 11:
                nif.setLetra("B");
                break;
            case 12:
                nif.setLetra("N");
                break;
            case 13:
                nif.setLetra("J");
                break;
            case 14:
                nif.setLetra("Z");
                break;
            case 15:
                nif.setLetra("S");
                break;
            case 16:
                nif.setLetra("Q");
                break;
            case 17:
                nif.setLetra("V");
                break;
            case 18:
                nif.setLetra("H");
                break;
            case 19:
                nif.setLetra("L");
                break;
            case 20:
                nif.setLetra("C");
                break;
            case 21:
                nif.setLetra("K");
                break;
            case 22:
                nif.setLetra("E");
                break;
        }
        return nif;
    }
    public void mostrarNif(Nif nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
}
