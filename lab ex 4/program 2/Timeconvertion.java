/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconvertion;
import pack1.*;
import pack2.*;
import pack3.*;
import java.util.*;
/**
 *
 * @author bhara
 */
public class Timeconvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Seconds:");
        int sec=obj.nextInt();
        System.out.print("Enter the Hours:");
        int hr=obj.nextInt();
        System.out.print("Enter the Minute:");
        int min=obj.nextInt();
        hour a1=new hour();
        second a2=new second();
        minute a3=new minute();
        a1.hourtomin(hr);
        a1.hourtosec(hr);
        a2.sectohour(sec);
        a2.sectomin(sec);
        a3.mintohour(min);
        a3.mintosec(min);
        // TODO code application logic here
    }
    
}
