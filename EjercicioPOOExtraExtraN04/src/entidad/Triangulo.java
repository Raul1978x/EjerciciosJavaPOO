package entidad;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: ● Calcular área ● Calcular perímetro ● Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 */
public class Triangulo {
    private double Base;
    private double ladoIgual;
    private double area;
    private double perimetro;
    private int cant;
    
    

    public Triangulo() {
    }

    public Triangulo(double base, double ladoB, double area, double perimetro) {
        this.Base = base;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getLadoIgual() {
        return ladoIgual;
    }

    public void setLadoIgual(double ladoIgual) {
        this.ladoIgual = ladoIgual;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "Base=" + Base + ", ladoIgual=" + ladoIgual + "\narea=" + area + ", perimetro=" + perimetro + '}';
    }

    
}
