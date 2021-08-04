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
public class Cliente extends Pessoa {

    private String endereco;
    private int cep;

    public Cliente(int id, String nome, char sexo,String dataNascimento, int Telefone, String email, int RG, String endereco, int cep) {
        super(id, nome, sexo, dataNascimento, Telefone, email, RG);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, int cep ) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return getNome();
    }

}
