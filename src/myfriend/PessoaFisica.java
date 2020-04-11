
package myfriend;

import java.util.Objects;

/**
 *
 * @author Pedro H. Martins
 */
public class PessoaFisica {
    
    
    private String pessoa;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    @Override
    public int hashCode() {
        /*hash code para comparativos mais detalhados de infomacoes duplicadas das variaveis
        cnpj, razao_social, nom_fantaia e senha_conta */
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.cnpj);
        hash = 71 * hash + Objects.hashCode(this.endereco);
        hash = 71 * hash + Objects.hashCode(this.telefone);
        hash = 71 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        /*equals para comparativos de infomacoes duplicadas das variaveis
        cnpj, razao_social, nom_fantaia e senha_conta */
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    /**
     * @return the pessoa
     */
    public String getPessoa() { //encapsulamento das variaveis
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() { // conversao ToString para as variaveis
        return "PessoaFisica{" + "pessoa=" + pessoa + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    
}
