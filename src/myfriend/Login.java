/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

/**
 *
 * @author Gustavo Guimarães
 */
import myfriend.SqlQuery;
import myfriend.ContaUsuario;

public class Login {
    //Vatiáveis ----------------------------------------------------------------------------------------------
    private String login;
    private String senha;
    //--------------------------------------------------------------------------------------------------------
    
    //Metodos ------------------------------------------------------------------------------------------------
    public void Login(String login, String senha)
    {
        //Verificar se as strings estã vazias.
        if(!login.equals("") || !senha.equals("")){
        this.login = login;
        this.senha = senha;
        }else{
            System.out.print("Erro: Conteudo de vazio.");
        }
    }
    
    public String getLogin()
    {
        return login;
    }
    
    public String getSenha()
    {
        return senha;
    }
    
    public void setLogin(String x)
    {
        login = x;
    }
    
    public void setSenha(String x)
    {
        senha = x;
    }
    
    public void logarUsuario()
    {
        SqlQuery sq = new SqlQuery();
        sq.executarVerificacao(getLogin(), getSenha());
    }
    //---------------------------------------------------------------------------------------------------------
}
