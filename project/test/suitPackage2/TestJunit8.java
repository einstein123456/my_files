/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suitPackage2;

import IntegerPackage.IntegerClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class TestJunit8 {
    char[] integer="10".toCharArray();
    IntegerClass integerClass = new IntegerClass(integer);

    @Test
    public void testPalindrome() {
    System.out.println("Inside IsPalindrome()");
    assertEquals(false, IntegerClass.IsPalindrome());
    }
 }