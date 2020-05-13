package myfriend;

import myfriend.Login;
import myfriend.SqlQuery;

/**
 * 
 * @author Klecia
 */



/* Criação das variáveis*/
public class ContaUsuario {
    
    private String nome;
    private String permissao;
    private String login;
    private String senha;
    
    /*Criação dos métodos*/
    public ContaUsuario(String nome, String permissao, String login, String senha) {        

        /*this para referenciar o objeto */        
        this.nome = nome; 
        this.permissao = permissao;
        this.login = login;
        this.senha = senha;
                
    }
    
    /*Métodos gets e sets */

    public String getNome() {
        return nome;
    }

    public String getPermissao() {
        return permissao;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;

    }

    /*Método para permissão a partir do nivel de usuário do banco de dados*/
    public void permissao() {
        SqlQuery sql = new SqlQuery();
        System.out.println("Nível de usuário: " + sql.nivelUsuario());

    }
    /*Método logar herdado da classse Login*/
    public void logar() {
        Login lgn = new Login();
        lgn.logarUsuario();

    }
}
