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
 * @author Pedro H Martins
 */
public class PessoaFisicaTest {
    
    public PessoaFisicaTest() {
    }

    /**
     * Test of hashCode method, of class PessoaFisica.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PessoaFisica instance = new PessoaFisica();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PessoaFisica.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PessoaFisica instance = new PessoaFisica();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoa method, of class PessoaFisica.
     */
    @Test
    public void testGetPessoa() {
        System.out.println("getPessoa");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.getPessoa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPessoa method, of class PessoaFisica.
     */
    @Test
    public void testSetPessoa() {
        System.out.println("setPessoa");
        String pessoa = "";
        PessoaFisica instance = new PessoaFisica();
        instance.setPessoa(pessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PessoaFisica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class PessoaFisica.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class PessoaFisica.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        String cnpj = "";
        PessoaFisica instance = new PessoaFisica();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class PessoaFisica.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class PessoaFisica.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        PessoaFisica instance = new PessoaFisica();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class PessoaFisica.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class PessoaFisica.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        PessoaFisica instance = new PessoaFisica();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class PessoaFisica.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        PessoaFisica instance = new PessoaFisica();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class PessoaFisica.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        PessoaFisica instance = new PessoaFisica();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
