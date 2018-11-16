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
public class Usuario {
    private int id;
    private Colaborador colaborador;
    private String login;
    private String senha;
    
    public Usuario(String login , String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toCSV(Colaborador colaborador) {
        return this.id + ";" + this.login + ";" + this.senha + ";" + colaborador.getId();
    }
    
    
    
    
}
