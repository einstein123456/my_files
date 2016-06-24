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
public class TestJunit1 {
    int integer = 0;
    IntegerClass integerClass = new IntegerClass(integer);

    @Test
    public void testIsEven() {
    System.out.println("Inside IsPrime()");
    assertEquals(true, IntegerClass.IsPrime());
}
 }