/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Colaborador;
import model.Usuario;
import model.UsuarioDao;

/**
 *
 * @author Thiago
 */
public class ControleUsuario {
    
    public ControleUsuario(){
        
    }
    
    public boolean AutenticarUsuario(Usuario usuario) throws FileNotFoundException, IOException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.Autenticar(usuario);
        
    }

    public void Cadastrar(Colaborador colaborador, Usuario usuario) {
        UsuarioDao usuarioDao = new UsuarioDao();
        
        usuarioDao.Cadastrar(colaborador , usuario);
        
    }
}
