/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfriend;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ygort
 */
public class SenhaTest {
    
    public SenhaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of recuperar_senha method, of class Senha.
     */
    @Test
    public void testRecuperar_senha() {
        System.out.println("recuperar_senha");
        Senha instance = new Senha();
        instance.recuperar_senha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Senha method, of class Senha.
     */
    @Test
    public void testSenha() {
        System.out.println("Senha");
        String x = "";
        String y = "";
        Senha instance = new Senha();
        instance.Senha(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Senha.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Senha instance = new Senha();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Senha.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Senha instance = new Senha();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Senha.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Senha instance = new Senha();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Senha.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Senha instance = new Senha();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Senha.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Senha instance = new Senha();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class Senha.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Senha instance = new Senha();
        String expResult = "";
        String result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class Senha.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        String cnpj = "";
        Senha instance = new Senha();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Senha.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Senha instance = new Senha();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Senha.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Senha instance = new Senha();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
