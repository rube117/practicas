/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author T-101
 */
public class ProbarOrdenamiento {
    public static void main(String[] args) {
        // Un arreglo que no acepta duplicados
        ArrayList<Opcion>
        
        Set<Integer> enteros=new LinkedHashSet<>();
        
        while(enteros.size()<4)
        {
            Random x=new Random();
            int valor=x.nextInt(4);
            enteros.add(valor);
            }
        
        // Este For necesita cambios
        for(Integer i:enteros)
        {
            System.out.println(i);
        }
        
        for(Integer i:enteros)
        {
            opcionesAleatorias.add(opciones.get(i))
        }
        
    }
}
