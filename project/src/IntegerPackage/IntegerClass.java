/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegerPackage;

/**
 *
 * @author X
 */
public class IntegerClass {

    private static char[] integers;
    private static int integer;

    public IntegerClass(char[] integer){
        IntegerClass.integers = integer;
    }

    public IntegerClass(int integer){
        IntegerClass.integer = integer;
    }

    public static boolean IsPalindrome(){
       int i1=0;
       int i2= integers.length-1;
       while(i2>i1){
           if(integers[i1]!=integers[i2]){
               return false;
           }
           ++i1;
           --i2;
       }
       return true;
    }

    public static boolean IsEven(){
        if(integer%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean IsPrime(){
        for(int i=2;i*2<integer;i++){
            if(integer%i==0)
                return false;
        }
        return true;
    }
}
