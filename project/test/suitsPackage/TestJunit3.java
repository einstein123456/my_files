/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suitsPackage;

import IntegerPackage.IntegerClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class TestJunit3 {
    int integer = 6;
    IntegerClass integerClass = new IntegerClass(integer);

    @Test
    public void testIsEven() {
    System.out.println("Inside IsEven()");
    assertEquals(true, IntegerClass.IsEven());
    }
 }