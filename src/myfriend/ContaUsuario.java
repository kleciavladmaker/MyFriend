package myfriend;

public class ContaUsuario {

    private String nome;
    private String permissao;
    private String login;
    private String senha;

    public ContaUsuario(String nome, String permissao, String login, String senha) {

        this.nome = nome;
        this.permissao = permissao;
        this.login = login;
        this.senha = senha;
    }

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
    
    public void permissao(){
        
    }
    
    public void logar(){
            
    }
}
