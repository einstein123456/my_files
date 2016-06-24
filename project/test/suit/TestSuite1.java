/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suit;

import suitPackage1.TestJunit4;
import suitPackage1.TestJunit5;
import suitPackage1.TestJunit6;
import suitPackage1.TestJunit7;
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
    TestJunit4.class,TestJunit5.class,TestJunit6.class,TestJunit7.class
})
public class TestSuite1 {

}

  