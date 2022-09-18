package servicio;

import entidad.Triangulo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: ● Calcular área ● Calcular perímetro ● Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 */
public class ServicioTriangulo {

    private Scanner leer;
    private List<Triangulo> ListaTriangulos;

    /**
     * Creamos el constructor del servicioTriangulo donde tenemos a disposicion
     * tanto el Scanner como la lista de triangulos.
     */
    public ServicioTriangulo() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ListaTriangulos = new ArrayList();
    }

    /**
     * Pide el largo de los lados del triangulo y los va guardando en una lista
     * de los triangulos creados.
     *
     * @return un objeto del tipo triangulo.
     */
    public Triangulo crearTriangulo() {

        Triangulo triangulo = new Triangulo();
        System.out.println("Ingrese tamaño de la base");
        triangulo.setBase(leer.nextDouble());
        System.out.println("Ingrese tamaño de los lados iguales");
        triangulo.setLadoIgual(leer.nextDouble());
        ListaTriangulos.add(triangulo);
        return triangulo;
    }

    /**
     * Recibe por parametro el triangulo creado y devuelve el valor del Area del
     * mismo, usa las siguientes formulas para el calculo: altura = √(lado
     * igual^2-lado^2/4) y area = base*altura/2.
     *
     * @param triangulo
     * @return valor del area.
     */
    public double calcularArea(Triangulo triangulo) {

        double altura = (double) Math.sqrt((Math.pow(triangulo.getLadoIgual(), 2))
                - (Math.pow((double) triangulo.getBase(), 2)) / 4);
        triangulo.setArea(triangulo.getBase() * (double) (altura) / 2);
        return (float) triangulo.getArea();
    }

    /**
     * Recibe por parametro el triangulo creado y devuelve el valor del
     * Perimetro del mismo, usa la siguiente formula para el calculo: perimetro
     * = 2*ladoIgual + lado.
     *
     * @param triangulo
     * @return valor del perimetro.
     */
    public double calcularPerimetro(Triangulo triangulo) {

        triangulo.setPerimetro((2 * triangulo.getLadoIgual()) + triangulo.getBase());
        return triangulo.getPerimetro();
    }

    /**
     * Muestra el valor de los lados, el area y el perimetro de cada uno de los
     * triangulos, como tambien la cantidad de triangulos cargados en la lista
     * de triangulos.
     */
    public void mostrarTriangulo() {

        System.out.println("Los triangulos actuales son: ");
        for (Triangulo aux : ListaTriangulos) {
            System.out.println(aux.toString());
        }
        System.out.println("La cantidad de triangulos es " + ListaTriangulos.size());
    }

    /**
     * Fabrica la cantidad de triangulos que necesitemos usando los metodos ya
     * creados para el calculo del area y del perimetro.
     *
     * @param cantidad
     */
    public void fabricaTriangulos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            Triangulo tr = crearTriangulo();
            calcularArea(tr);
            calcularPerimetro(tr);
        }
    }

    /**
     * Compara el area de cada uno de los triangulos y nos devuelve el mayor
     * usando los metodos pertenecientes a las List.
     *
     */
    public void mayorArea() {

        Triangulo aux = new Triangulo();
        double mayor = 0;
        for (int i = 0; i < ListaTriangulos.size(); i++) {
            if (ListaTriangulos.get(i).getArea() > mayor) {
                mayor = ListaTriangulos.get(i).getArea();
            }
        }
        System.out.println("El area mayor es  : " + mayor);
    }

    /**
     * Crea un menu en donde pide la cantidad de trianguloa a crear y usa los
     * metodos de fabrica de triangulos(), mostrarTriangulos() y mayorArea().
     */
    public void menuTriangulo() {

        System.out.println("Ingrese la cantidad de triangulos a crear: ");
        int cantidad = leer.nextInt();
        fabricaTriangulos(cantidad);
        mostrarTriangulo();
        mayorArea();
    }
}
