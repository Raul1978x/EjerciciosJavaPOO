/**
 * 5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package entidad;

public class Mes {
    
    private static String[] mesNum={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
    private int mesSecreto;
    private String adivinanza;

    public Mes() {
    }

    public Mes(String[] mesNum, int mesSecreto, String adivinanza) {
        this.mesSecreto = mesSecreto;
        this.adivinanza = adivinanza;
    }

    public String[] getMesNum() {
        return mesNum;
    }


    public int getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(int mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getAdivinanza() {
        return adivinanza;
    }

    public void setAdivinanza(String adivinanza) {
        this.adivinanza = adivinanza;
    }

    @Override
    public String toString() {
        return "Mes{" + "mesNum=" + mesNum + ", mesSecreto=" + mesSecreto + ", adivinanza=" + adivinanza + '}';
    }

}


