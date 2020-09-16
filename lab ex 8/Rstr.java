/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestr;
import java.util.*;
/**
 *
 * @author User
 */
public class Reversestr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str=new String("OOPS CLASS");
        char c[]=str.toCharArray();
        System.out.println("String before reverse:"+str);
        System.out.print("String after reverse:");
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        // TODO code application logic here
    }
    
}
