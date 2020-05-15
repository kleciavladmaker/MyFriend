package myfriend;

import java.util.Objects;
//import myfriend.SqlQuery;
//import myfriend.Login;         
        
        
/**
 *
 * @author ygort
 */
    /** A classe senha foi criada para facilitar o recurso de recuperação de 
     * senha pelo usuario, usando dados pessoais para comprovar veracidade.
     * Como por exemplo: e-mail,cnpj/cpf e dados do login.
     */
public class Senha { 
        //Criação das variaveis//
    private String email;
    private String cnpj;
    private String cpf;
    
    
    public void recuperar_senha(){}
        //Metodo para recuperar senha//
    public void Senha(String x, String y) 
    {

        setEmail(x);

        if(y.length() == 14){
            setCnpj(y);
        }
        else if(y.length() == 11)
        {
            setCpf(y);
        }
        else
        {
            System.out.print("Erro: Não é um cpf e nem um cnpj");
        }
    }
    
    
    
    @Override       //hashCode e equals usados para comparar variaveis com informações duplicadas//
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cnpj);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Senha other = (Senha) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    
    
    @Override       //Criação dos gets e sets//
    public String toString() {
        return "Senha{" + "email=" + email + ", cnpj=" + cnpj + ", cpf=" + cpf + '}';
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
//public String Senha()
   // {
   //     SqlQuery sq = new SqlQuery();
   //     return sq.requerySenha();
   // }
    
    
}