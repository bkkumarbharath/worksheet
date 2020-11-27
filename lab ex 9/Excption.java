/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excption;
import java.util.*;
/**
 *
 * @author User
 */
public class Excption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        try
        {
            int a=10;
            int b=0;
            int k=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("======================================================================================");
        }
        try
        {
            System.out.println("Enter the Integer:");
            int d=Integer.parseInt(obj.next());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("=======================================================================================");
        }
        try
        {
            int a1[]=new int[3];
            a1[5]=32;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("=======================================================================================");
        }
        try
        {
            String str="welcome to opps";
            str.charAt(40);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("=======================================================================================");
        }
        
        // TODO code application logic here
    }
    
}
