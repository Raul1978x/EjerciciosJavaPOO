/**
 * 5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
 * los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
 * de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
 * programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
 * un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
 * ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 */
package ServiceMes;

import entidad.Mes;
import java.util.Scanner;

public class ServiceMes {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Mes crear() {
        Mes mes = new Mes();
        mes.setMesSecreto((int) (Math.random() * 12));
        mes.setAdivinanza(mes.getMesNum()[mes.getMesSecreto()]);
        System.out.println(mes.getAdivinanza());

        return mes;
    }

    public void adivinar(Mes m) {
        String ingreso = "";
        do {
            System.out.println("Ingrese un mes");
            ingreso =leer.next().toLowerCase();
            if(!(m.getAdivinanza().equals(ingreso))){
                System.out.println("LOSEEEEER!!!!!!");
            }else{
                System.out.println("YOU ARE WINNER!!!!");
            }
        } while (!(m.getAdivinanza().equals(ingreso)));
    }
}
