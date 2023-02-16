/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package coche;

import junit.framework.TestCase;

/**
 *
 * @author Estudio
 */
public class CocheTest extends TestCase {
    
    public CocheTest(String testName) {
        super(testName);
    }

    

    
    public void testComprarValido() throws Exception {
        System.out.println("Comprar positivo");
        int cantidad = 100;
        Coche instance = new Coche("audi", 1234, 3);
        try{
        instance.comprar(cantidad);
        assertTrue(instance.obtenerStock()==103);
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }}
    public void testComprarInvalidoNegativo() throws Exception {
        System.out.println("comprar en negativo");
        int cantidad = -5;
        Coche instance = new Coche("audi", 1234, 3);
        try{
        instance.comprar(cantidad);
        fail("The test case is a prototype.");
       
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerStock()==3);
            System.out.println(e);
    }}
     public void testComprarInvalidoCero() throws Exception {
        System.out.println("comprar cero");
        int cantidad = 0;
        Coche instance = new Coche("audi", 1234, 3);
        try{
        instance.comprar(cantidad);
        fail("The test case is a prototype.");
       
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerStock()==3);
            System.out.println(e);
    }}

    
    public void testVenderValidoPositivoConStock() throws Exception {
        System.out.println("vender validpo");
        int cantidad = 100;
        Coche instance = new Coche("audi", 1234, 200);
        try{
        instance.vender(cantidad);
        assertTrue(instance.obtenerStock()==100);
        }catch( Exception e){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    public void testVenderInvalidoNegativo() throws Exception {
        System.out.println("vender negativo");
        int cantidad = -5;
        Coche instance = new Coche("audi", 1234, 10);
        try{
        instance.vender(cantidad);
        fail("The test case is a prototype.");
       
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerStock()==10);
            System.out.println(e);
    }}
    public void testVenderInvalidoCero() throws Exception {
        System.out.println("vender cero");
        int cantidad = 0;
        Coche instance = new Coche("audi", 1234, 10);
        try{
        instance.vender(cantidad);
        fail("The test case is a prototype.");
       
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerStock()==10);
            System.out.println(e);
    }}
    
    public void testVenderInvalidoMasQueStock() throws Exception {
        System.out.println("vender mas que el stok");
        int cantidad = 100;
        Coche instance = new Coche("audi", 1234, 10);
        try{
        instance.vender(cantidad);
        fail("The test case is a prototype.");
        }catch(Exception e) { // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.obtenerStock()==10);
            System.out.println(e);
    }}
    
}
