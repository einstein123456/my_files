/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringReversePackage;

/**
 *
 * @author X
 */
public class Reverse {
   private String string = "";
    public Reverse(String string){
        this.string = string;
    }

    public String ReverseString(){
        StringBuilder str=new StringBuilder();
        str.append(string);
        str=str.reverse();
        return str.toString();
    }
}
