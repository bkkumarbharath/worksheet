/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detail;
import java.util.*;

/**
 *
 * @author bhara
 */
public class Detail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student arr[]=new student[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=new student();
            arr[i].getdata();
            arr[i].display();
        }
        
        
        // TODO code application logic here
    }
    
}
class student
{
    int rollno;
    String name;
    static String college_name="Velammal";
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Roll no:");
        rollno=obj.nextInt();
        System.out.println("Enter the name of the student:");
        name=obj.next();
    }
    void display()
    {
        System.out.println("===============================================");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("College_Name:"+college_name);
        System.out.println("===============================================");
    }

}