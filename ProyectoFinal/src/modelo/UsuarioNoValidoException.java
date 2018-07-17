/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author T-101
 */
public class UsuarioNoValidoException extends Exception {
    public UsuarioNoValidoException() {
        super("El usuario no es válido.");
    }
}
