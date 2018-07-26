/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import java.util.ArrayList;

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

}
