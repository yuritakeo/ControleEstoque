/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thiago
 */
public class Produto {
    private int codigo;
    private String codBarra;
    private String nome;
    private String fabricante;


    public Produto(int codigo, String codBarra, String nome, String fabricante) {
        this.codigo = codigo;
        this.codBarra = codBarra;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }



    public String toCSV() {
        return this.codigo + ";" + this.codBarra + ";" + this.nome + ";" + this.fabricante;
    }
    
    
    
}
