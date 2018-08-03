/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class Prueba {

    public static void main(String[] args) {
        try {
            ArrayList<Opcion> opciones = PersistenciaPreguntas.leer().get(0).getOpciones();

            for (Opcion o : opciones) {
                System.out.println(o.getTitulo());
            }
            System.out.println("____________________");
            opciones = PersistenciaPreguntas.opcionesAleatorias(opciones);
            for (Opcion o : opciones) {
                System.out.println(o.getTitulo());
            }

        } catch (Exception ex) {

        }

    }
}
