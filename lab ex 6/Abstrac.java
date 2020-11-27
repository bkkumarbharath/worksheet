/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac;
import java.util.*;
/**
 *
 * @author User
 */
public class Abstrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        shape a1=new rectangle();
        System.out.println("Enter length and breadth:");
        a1.a=obj.nextInt();
        a1.b=obj.nextInt();
        a1.printArea();
        a1=new triangle();
        System.out.println("Enter base and height:");
        a1.a=obj.nextInt();
        a1.b=obj.nextInt();
        a1.printArea();
        a1=new circle();
        System.out.println("Enter radius:");
        a1.a=obj.nextInt();
        a1.printArea();
        // TODO code application logic here
    }
    
}
abstract class shape
{
    int a;
    int b;
    abstract void printArea();
}
class rectangle extends shape
{
    @Override
    public void printArea()
    {
        System.out.println("Area of the Rectangle:"+a*b);
    }
}
class triangle extends shape
{
    @Override
    public void printArea()
    {
        System.out.println("Area of the Triangle:"+0.5*a*b);
    }
}
class circle extends shape
{
    @Override
    public void printArea()
    {
        System.out.println("Area of the Circle:"+Math.PI*a*a);
    }
}
