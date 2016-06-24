/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suit;

import suitePackage3.TestJunit11;
import suitePackage3.TestJunit12;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import stringReversePackage.Reverse;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author X
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestJunit11.class,TestJunit12.class
})
 public class TestSuite3 {

}

 