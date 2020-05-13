/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import java.util.Date;

/**
 *
 * @author Júlia Brandão
 */
    /**A classe Cadastro de Usuário foi criada para que o usuário insira seus dados para o cadastro dentro 
     * do site, para fazer o login serão obrigatorios alguns dados, como nome nascimento, endereço, caso
     * pessoa jurídica (ONG) insirir o CNPJ, caso pessoa física insira seu cpf, no qual será a validação
     * do usuário
     */
    public class CadastroUsuario {
    private String nome;
    private Date nascimento;
    private String endereco;
    private String cnpj;
    private String cpf;
    private String email;
    private String telefone;     
    
    
  

public CadastroUsuario(String nome, Date nascimento,String endereco, String cnpj, String cpf, String email, String telefone){
    
   this.nome = nome;   //this refere-se a si proprio, ele é necessário em situações que vc precisa referenciar o proprio objeto//
   this.nascimento = nascimento; // o this você identifica a variavel local da classe//
   this.endereco = endereco;
   this.cnpj = cnpj;
   this.cpf = cpf;
   this.email = email;
   this.telefone =  telefone;
   
}
/**
 * Quando formos acessar, “pegar” alguns atributos da classe, devemos utilizar os métodos GET.
 * Esse método sempre retornará um valor, seja ele String, int ,double etc. Então devemos criar uma função.
 * 
     * @return 
 */
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
    * Esse método não terá um retorno, pois o atributo será somente modificado, criando um método de tipo VOID, 
    * sem retorno. Porém ele deve receber algum argumento para que possa ocorrer a devida alteração
    */
   
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






    