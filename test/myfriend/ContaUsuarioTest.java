/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Klecia
 */
public class ContaUsuarioTest {
    
    public ContaUsuarioTest() {
    }

    @org.junit.Test
    public void testGetNome() {
        System.out.println("getNome");
        ContaUsuario instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetPermissao() {
        System.out.println("getPermissao");
        ContaUsuario instance = null;
        String expResult = "";
        String result = instance.getPermissao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetLogin() {
        System.out.println("getLogin");
        ContaUsuario instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetSenha() {
        System.out.println("getSenha");
        ContaUsuario instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ContaUsuario instance = null;
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetPermissao() {
        System.out.println("setPermissao");
        String permissao = "";
        ContaUsuario instance = null;
        instance.setPermissao(permissao);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        ContaUsuario instance = null;
        instance.setLogin(login);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        ContaUsuario instance = null;
        instance.setSenha(senha);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testPermissao() {
        System.out.println("permissao");
        ContaUsuario instance = null;
        instance.permissao();
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testLogar() {
        System.out.println("logar");
        ContaUsuario instance = null;
        instance.logar();
        fail("The test case is a prototype.");
    }
    
}
