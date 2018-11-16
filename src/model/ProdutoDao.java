/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;

/**
 *
 * @author Thiago
 */
public class ProdutoDao {
    private final String caminhoProdutoDados = "C:\\Users\\Thiago\\Documents\\NetBeansProjects\\ControleEstoque\\src\\Dados\\Produto.txt";
    public void Cadastrar(Produto produto) {
        try {
            File arquivo = new File(caminhoProdutoDados);
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            

            bw.newLine();
            bw.write(produto.toCSV());

            
            bw.flush();
            bw.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    
    
}
