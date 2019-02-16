/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import java.util.*;

/**
 *
 * @author ruben
 */
public class PersistenciaPreguntas {

    // Primero guardamos
    public static void guardar(Pregunta p) throws Exception {
        // Paso 1: Generar el archivo donde se va a guardar
        // nustro serializado
        // D:/Java/
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("Archivo.verduzco");

        if (file.exists()) {
            preguntas = leer();
        }
        preguntas.add(p);
        // Paso 2: Es indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);

        // Paso 3: Escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();
    }

    public static ArrayList<Pregunta> leer() throws Exception {
        // Para leer primero ponemos el archivo
        File file = new File("Archivo.verduzco");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Pregunta> preguntas = (ArrayList<Pregunta>) ois.readObject();
        return preguntas;
    }

    public static ArrayList<Opcion>
            opcionesAleatorias(ArrayList<Opcion> opciones) {

        ArrayList<Opcion> opcionesAleatorias = new ArrayList<>();

        Set<Integer> enteros = new LinkedHashSet<>();

        while (enteros.size() < 4) {
            Random r = new Random();
            int valor = r.nextInt(4);
            enteros.add(valor);
        }
        for (Integer i : enteros) {
            opcionesAleatorias.add(opciones.get(i));
        }
        return opcionesAleatorias;
    }
}
