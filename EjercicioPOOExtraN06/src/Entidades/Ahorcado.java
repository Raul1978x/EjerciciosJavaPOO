/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.util.Arrays;

/**
 *
 * @author MNXC04
 */
public class Ahorcado {
    private String[] palabra;
    private int cantEncontradas;
    private int cantIntentos;
    private int faltantes;
    private char[] solucion={'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_'};

    public char[] getSolucion() {
        return solucion;
    }

    public void setSolucion(char[] solucion) {
        this.solucion = solucion;
    }

    public int getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantEncontradas, int cantIntentos) {
        this.palabra = palabra;
        this.cantEncontradas = cantEncontradas;
        this.cantIntentos = cantIntentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", cantEncontradas=" + cantEncontradas + ", cantIntentos=" + cantIntentos + ", faltantes=" + faltantes + ", solucion=" + Arrays.toString(solucion) + '}';
    }

 
}
