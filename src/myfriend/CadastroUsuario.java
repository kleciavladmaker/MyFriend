/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import java.util.Date;

/**
 *
 * @author Operador
 */
    /**
     *
     */
    public class CadastroUsuario {
    private String nome;
    private Date nascimento;
    private String endereco;
    private String cnpj;
    private String cpf;
    private String email;
    private final String telefone;     
  


public CadastroUsuario(String nome, Date nascimento,String endereco, String cnpj, String cpf, String email, String telefone){
    
   this.nome = nome;   //this refere-se a si proprio, ele é necessário em situações que vc precisa referenciar o proprio objeto//
   this.nascimento = nascimento; // o this você identifica a variavel local da classe//
   this.endereco = endereco;
   this.cnpj = cnpj;
   this.cpf = cpf;
   this.email = email;
   this.telefone =  telefone;
   
}

 public String getNome() {
        return nome;
    }
 
 public Date getNascimento() {
        return nascimento;
    }
 
  public String getEndereco() {
        return endereco;
    }
  
  public String getCnpj() {
        return cnpj;
    }
  
  public String getCpf() {
        return cpf;
    }
  
   public String getEmail() {
        return email;
    }
   
   public String getTelefone() {
        return telefone;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
  
    }






    