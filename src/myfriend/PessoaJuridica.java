/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import java.util.Objects;

/**
 *
 * @author Pedro H Martins
 */
public class PessoaJuridica {
    
    private String cnpj;
    private String endereco;
    private String telefone;

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {     
        /*hash code para comparativos mais detalhados de infomacoes duplicadas das variaveis
        cnpj, razao_social, nom_fantaia e senha_conta */
        
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cnpj);
        hash = 67 * hash + Objects.hashCode(this.razao_social);
        hash = 67 * hash + Objects.hashCode(this.nom_fantasia);
        hash = 67 * hash + Objects.hashCode(this.senha_conta);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.razao_social, other.razao_social)) {
            return false;
        }
        if (!Objects.equals(this.nom_fantasia, other.nom_fantasia)) {
            return false;
        }
        if (!Objects.equals(this.senha_conta, other.senha_conta)) {
            return false;
        }
        return true;
    }
    private String email;
    private String razao_social;
    private String nom_fantasia;
    private String senha_conta;
    private int cod_atv_econom;
    private String nom_atv_econom;

    /**
     *
     * @return
     */
    @Override
    public String toString() {  // conversao ToString para as variaveis
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", razao_social=" + razao_social + ", nom_fantasia=" + nom_fantasia + ", senha_conta=" + senha_conta + ", cod_atv_econom=" + cod_atv_econom + ", nom_atv_econom=" + nom_atv_econom + ", situcao_cadastral=" + situcao_cadastral + '}';
    }
    private String situcao_cadastral;

    /**
     * @return the cnpj
     */
    public String getCnpj() {  //encapsulamento das variaveis
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

    /**
     * @return the razao_social
     */
    public String getRazao_social() {
        return razao_social;
    }

    /**
     * @param razao_social the razao_social to set
     */
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    /**
     * @return the nom_fantasia
     */
    public String getNom_fantasia() {
        return nom_fantasia;
    }

    /**
     * @param nom_fantasia the nom_fantasia to set
     */
    public void setNom_fantasia(String nom_fantasia) {
        this.nom_fantasia = nom_fantasia;
    }

    /**
     * @return the senha_conta
     */
    public String getSenha_conta() {
        return senha_conta;
    }

    /**
     * @param senha_conta the senha_conta to set
     */
    public void setSenha_conta(String senha_conta) {
        this.senha_conta = senha_conta;
    }

    /**
     * @return the cod_atv_econom
     */
    public int getCod_atv_econom() {
        return cod_atv_econom;
    }

    /**
     * @param cod_atv_econom the cod_atv_econom to set
     */
    public void setCod_atv_econom(int cod_atv_econom) {
        this.cod_atv_econom = cod_atv_econom;
    }

    /**
     * @return the nom_atv_econom
     */
    public String getNom_atv_econom() {
        return nom_atv_econom;
    }

    /**
     * @param nom_atv_econom the nom_atv_econom to set
     */
    public void setNom_atv_econom(String nom_atv_econom) {
        this.nom_atv_econom = nom_atv_econom;
    }

    /**
     * @return the situcao_cadastral
     */
    public String getSitucao_cadastral() {
        return situcao_cadastral;
    }

    /**
     * @param situcao_cadastral the situcao_cadastral to set
     */
    public void setSitucao_cadastral(String situcao_cadastral) {
        this.situcao_cadastral = situcao_cadastral;
    }
    
            
    
}
