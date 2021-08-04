/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Usuario extends Pessoa {
    
   
    protected String Senha;
    protected String nivelDeAcesso; 

    public Usuario(int id, String nome, String Senha) {
        super(id, nome);
        this.Senha = Senha;
    }

    public Usuario(int id, String nome , char Sexo, String dataNascimento,int Telefone, String email, int RG, String Senha, String nivelDeAcesso ) {
        super(id, nome, Sexo, dataNascimento, Telefone, email, RG);
        this.Senha = Senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    

  

    
        
     
    
}
