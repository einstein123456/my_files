/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suitPackage1;

import IntegerPackage.IntegerClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class TestJunit7{
    int integer = 113;
    IntegerClass integerClass = new IntegerClass(integer);

    @Test
    public void testIsPrime() {
    System.out.println("Inside IsPrime()");
    assertEquals(true, IntegerClass.IsPrime());
    }
 }