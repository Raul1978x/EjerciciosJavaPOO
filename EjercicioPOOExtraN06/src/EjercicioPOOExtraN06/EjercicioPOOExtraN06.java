package EjercicioPOOExtraN06;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;

public class EjercicioPOOExtraN06 {

    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a1 = as.crearJuego();
        as.juego(a1);
        
    }
    
}
