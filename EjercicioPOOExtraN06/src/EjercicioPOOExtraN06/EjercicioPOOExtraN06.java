/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPOOExtraN06;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;

/**
 *
 * @author MNXC04
 */
public class EjercicioPOOExtraN06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a1 = as.crearJuego();
        as.juego(a1);
        
    }
    
}
