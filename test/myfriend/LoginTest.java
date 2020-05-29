/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gusta
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String login = "GustavoGuimaraes";
        String senha = "123456";
        Login instance = new Login();
        instance.Login(login, senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Login.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Login.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Login.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String x = "";
        Login instance = new Login();
        instance.setLogin(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Login.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String x = "";
        Login instance = new Login();
        instance.setSenha(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logarUsuario method, of class Login.
     */
    @Test
    public void testLogarUsuario() {
        System.out.println("logarUsuario");
        Login instance = new Login();
        instance.logarUsuario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
