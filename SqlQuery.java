/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

/**
 *
 * @author Gustavo Guimaraes
 * Obs: ainda não foi contuido a tabele e nem o banco de dados .... é uma classe a ser implementada 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlQuery {
    //Variáveis---------------------------------------------------------------------------------------------------
    //NOME DE SEVIDORES,LOGIN E TABELA FICTÍCIO 
    private String connection = "jdbc:sqlserver://172.168.1.10:70;databaseName=MYFRIENDS;user=MYADMIN;password=123456#ABACATE";
    private String queryLogin = "SELECT NOME_USUÁRIO, LOGIN, SENHA, NIVEL_PERMISSAO FROM MYFRENDS.DBO.TABELA_USUÁRIO WREHE LOGIN IN ('?') AND STATUS IN (0)";
    private String[] aux = new String[4];
    private String loginUsuario;
    String teste;
    //------------------------------------------------------------------------------------------------------------
    
    //Métodos ----------------------------------------------------------------------------------------------------
    public void setLogin_Usuario(String x)
    {
        this.loginUsuario = x;
    }
         
    private Boolean request()
    {
        int i =0;
        //Estabelecer a conexão e executar a query
        try (Connection conn =DriverManager.getConnection(connection.replace("?", loginUsuario)); Statement st = conn.createStatement();)
        {
            ResultSet rt = st.executeQuery(queryLogin);
            
            while(rt.next())
            {
              aux[i] = rt.getString(i+1);
              i++;
            }
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Usuário não encontardo");
            return false;
        }
    }
    
    private Boolean verificarSenha(String x)
    {
        if(aux[3].equals(x))
        {
            System.out.println("Senha correta! :)");
            return true;
        }
        else
        {
            System.out.println("Senha incorreta! ;(");
            return false;
        }
    }
    
    public Boolean executarVerificacao(String login, String senha)
    {
        setLogin_Usuario(login);
        
     if(request().booleanValue() == true && verificarSenha(senha).booleanValue() == true)
         return true;
     else
         return false;
    }
    
    public String nivelUsuario()
    {
        return aux[aux.length-1];
    }
    //--------------------------------------------------------------------------------------------------------------
}

