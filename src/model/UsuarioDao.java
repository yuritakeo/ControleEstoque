/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;


/**
 *
 * @author Thiago
 */
public class UsuarioDao {
    private final String caminhoUsuarioDados = "C:\\Users\\Thiago\\Documents\\NetBeansProjects\\ControleEstoque\\src\\Dados\\Usuario.txt";
    private final String caminhoColaboradorDados = "C:\\Users\\Thiago\\Documents\\NetBeansProjects\\ControleEstoque\\src\\Dados\\Colaborador.txt";
    
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

    public void Cadastrar(Colaborador colaborador, Usuario usuario) {
        try {
            File arquivo = new File(caminhoColaboradorDados);
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            

            LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivo));
            linhaLeitura.skip(arquivo.length());
            int novoIdColaborador = linhaLeitura.getLineNumber() + 1;
 
            
            colaborador.setId(novoIdColaborador);
            bw.write(colaborador.toCSV() + "\n\n");

            bw.flush();
            bw.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        try {
            File arquivo = new File(caminhoUsuarioDados);
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivo));
            linhaLeitura.skip(arquivo.length());
            int novoIdUsuario = linhaLeitura.getLineNumber() + 1;
            
            
            usuario.setId(novoIdUsuario);
            bw.write(usuario.toCSV(colaborador) + "\n\n");
            
            bw.flush();
            bw.close();
            System.out.println("concluido");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
