/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suitePackage3;

import org.junit.Test;
import stringReversePackage.Reverse;
import static org.junit.Assert.*;

/**
 *
 * @author X
 */
public class TestJunit12 {
    String reversed = "8BitPlatoon";
    Reverse reverse = new Reverse(reversed);

    @Test
    public void testReverseString() {
    System.out.println("Inside ReverseString()");
    assertEquals("nootalPtiB8", reverse.ReverseString());
    }
 }
