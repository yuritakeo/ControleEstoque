/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Thiago
 */
public class UsuarioDao {
    private final String caminhoUsuarioDados = "C:\\Users\\Thiago\\Documents\\NetBeansProjects\\ControleEstoque\\src\\Dados\\Usuario.txt";
    public boolean Autenticar(Usuario usuario) throws FileNotFoundException, IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoUsuarioDados))) {
            while(br.ready()){
                String dados[] = br.readLine().split(";");
                if (usuario.getLogin().equals(dados[1]) && usuario.getSenha().equals(dados[2])){
                    return true;
                }
            }
        } 
        return false;
    }
}
