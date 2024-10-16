/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.eventreservartion;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class EventReservartionTest {
   

    /**
     * Test of checkBookingCode method, of class EventReservartion.
     */
    @org.junit.jupiter.api.Test
    public void testCheckBookingCode() {
        System.out.println("checkBookingCode");
        String code = "";
        boolean expResult = false;
        boolean result = EventReservartion.checkBookingCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class EventReservartion.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = EventReservartion.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeReservation method, of class EventReservartion.
     */
    @org.junit.jupiter.api.Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        String bookingCode = "";
        String password = "";
        String expResult = "";
        String result = EventReservartion.makeReservation(bookingCode, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EventReservartion.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EventReservartion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
