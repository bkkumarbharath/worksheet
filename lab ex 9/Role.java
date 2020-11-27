/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package role;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Role {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name:");
        String na=obj.next();
        System.out.println("Enter the age:");
        int ag=obj.nextInt();
        System.out.println("Enter the qualification:");
        String qa=obj.next();
        System.out.println("Enter the experience:");
        int ex=obj.nextInt();
        try
        {
            Manager a1=new Manager(na,ag,qa,ex);
            a1.checker();
        }
        catch(RoleNotApplicableException e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
}
class Manager
{
    String name,qualification;
    int age,experience;
    Manager(String n,int a,String q,int e)
    {
        name=n;
        age=a;
        qualification=q;
        experience=e;
    }
    void checker() throws RoleNotApplicableException
    {
        char c[]=qualification.toCharArray();
        int x=experience;
        for(int i=0;i<1;i++)
        {
            if(c[i]=='m'&&c[i+1]=='b'&&c[i+2]=='a')
            {
                System.out.print("");
                break;
            }
            else
            {
                throw new RoleNotApplicableException("Not Eligible Quaification:"+qualification);
            }
        
        }
        if(x<10)
        {
            throw new RoleNotApplicableException("Not Eligible Experience:"+x);
        }
        else
        {
            System.out.println("RoleApplicable");
        }
        System.out.println("Qualification:"+qualification+"\nExperience:"+x);
    }
}
class RoleNotApplicableException extends Exception
{
    String message;
    RoleNotApplicableException(String msg)
    {
        super(msg);
    }
}
