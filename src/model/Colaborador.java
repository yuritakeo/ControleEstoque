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
public class Colaborador {
    private int id;
    private String nome;
    private String cpf;
    private String funcao;
    private String setor;

    public Colaborador(String nome, String cpf, String funcao, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String toCSV() {
        return this.id + ";" + this.nome + ";" + this.cpf  + ";" +  this.funcao  + ";" + this.setor;
    }
    
    
    
}
