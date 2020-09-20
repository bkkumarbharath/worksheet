/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchelement;
import java.util.*;
/**
 *
 * @author barathbalajivs
 */
public class tll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Double n;
        System.out.println("Enter the number :");
        n=obj.nextDouble();
        System.out.println("Small Integer not less than the number :"+Math.floor(n));
        System.out.println("Given Number :"+n);
        System.out.println("Largest Number not greater than the number  :"+Math.ceil(n));
        // TODO code application logic here
    }
    
}
