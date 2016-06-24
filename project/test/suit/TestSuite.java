/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suit;

import suitsPackage.TestJunit1;
import suitsPackage.TestJunit2;
import suitsPackage.TestJunit3;
import suit.TestSuite.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 *
 * @author X
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestJunit1.class,TestJunit2.class,TestJunit3.class
})
public class TestSuite {

}

