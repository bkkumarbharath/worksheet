/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1;
import java.util.*;

/**
 *
 * @author bhara
 */
public class static1D2D3D {
    static int b[]=new int[10];
    static int m[][]=new int[10][10];
    static int c[][][]=new int[10][10][10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of 1D:");
        int s1=obj.nextInt();
        System.out.println("enter the value in array:");
        for(int i=1;i<=s1;i++)
        {
            b[i]=obj.nextInt();
        }
        System.out.println("=========================================");
        System.out.println("One Dimensional array:");
        for(int i=1;i<=s1;i++)
        {
            System.out.println(b[i]);
        }
        System.out.println("=========================================");
        System.out.println("Enter the size of 2D");
        int s2=obj.nextInt();
        int s3=obj.nextInt();
        System.out.println("Enter the value in 2D");
        for(int i=0;i<s2;i++)
        {
            for(int j=0;j<s3;j++)
            {
                m[i][j]=obj.nextInt();
            }
            
        }
        System.out.println("Enter the value in 2D");
        System.out.println("=================================================");
        System.out.println("Two Dimensional Array:");
        for(int i=0;i<s2;i++)
        {
            System.out.println("");
            for(int j=0;j<s3;j++)
            {
                System.out.print(+m[i][j]+"    ");
            }
        }
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Enter the size of array:");
        int s4=obj.nextInt();
        int s5=obj.nextInt();
        int s6=obj.nextInt();
        System.out.println("Enter the value of 3D:");
        for(int i=0;i<s4;i++)
        {
            for(int j=0;j<s5;j++)
            {
                for(int k=0;k<s6;k++)
                {
                    c[i][j][k]=obj.nextInt();
                }
            }
        }
         for(int i=0;i<s4;i++)
        {
            for(int j=0;j<s5;j++)
            {System.out.println("");
                for(int k=0;k<s6;k++)
                {
                    System.out.print(c[i][j][k]+"     ");
                }
            }
        }
        
        
        // TODO code application logic here
    }
    
}
