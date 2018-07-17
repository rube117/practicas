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
public class ValidarUsuario {

    public static void validarNoUsuario(String u, String p) throws UsuarioNoValidoException {
        if (!u.equals("ruben")&&!p.equals("16533851")) 
            throw new UsuarioNoValidoException();
    }
}
