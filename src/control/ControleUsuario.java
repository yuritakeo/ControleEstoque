/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Usuario;
import model.UsuarioDao;

/**
 *
 * @author Thiago
 */
public class ControleUsuario {
    public boolean AutenticarUsuario(Usuario usuario) throws FileNotFoundException, IOException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.Autenticar(usuario);
        
    }
}
