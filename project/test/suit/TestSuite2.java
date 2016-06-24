/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suit;

import suitPackage2.TestJunit9;
import suitPackage2.TestJunit8;
import suitPackage2.TestJunit10;
import IntegerPackage.IntegerClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author X
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestJunit8.class,TestJunit9.class,TestJunit10.class
})
public class TestSuite2 {

}

 