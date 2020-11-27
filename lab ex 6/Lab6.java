/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.*;
/**
 *
 * @author User
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printable a1=new rectangle();
        a1.print();
        a1=new sportscar();
        a1.print();
        a1=new manager();
        a1.print();
        // TODO code application logic here
    }
    
}
interface printable
{
    Scanner obj=new Scanner(System.in);
    abstract void print();
}
class rectangle implements printable
{
    @Override
    public void print()
    {
        int a,b;
        System.out.println("Enter Length and Breadth:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("===================================================");
        System.out.println("Length of Rectangle:"+a);
         System.out.println("Breadth of Rectangle:"+b);
        System.out.println("Area of Rectangle:"+a*b);
        System.out.println("===================================================");
    }
}
class sportscar implements printable
{
    @Override
    public void print()
    {
        String brandname,model;
        int price;
        System.out.println("Enter BrandName:");
        brandname=obj.next();
        System.out.println("Enter Model:");
        model=obj.next();
        System.out.println("Enter Price:");
        price=obj.nextInt();
        System.out.println("===================================================");
        System.out.println("BrandName:"+brandname);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
        System.out.println("===================================================");
    }
}
class manager implements printable
{
    @Override
    public void print()
    {
        String name,employeeid,salarydetails;
        int age;
        System.out.println("Enter Name:");
        name=obj.next();
        System.out.println("Enter Age:");
        age=obj.nextInt();
        System.out.println("Enter Employee Id:");
        employeeid=obj.next();
        System.out.println("Enter Salary Details:");
        salarydetails=obj.next();
        System.out.println("===================================================");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Employee Id:"+employeeid);
        System.out.println("Salary Details:"+salarydetails);
        System.out.println("===================================================");

    }
}