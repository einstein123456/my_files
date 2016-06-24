/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suitsPackage;

import IntegerPackage.IntegerClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class TestJunit2 {
    int integer = 3;
    IntegerClass integerClass = new IntegerClass(integer);

    @Test
    public void testIsEven() {
    System.out.println("Inside IsEven()");
    assertEquals(false, IntegerClass.IsEven());
    }
 }