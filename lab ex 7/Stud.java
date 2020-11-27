/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;
import java.util.*;
/**
 *
 * @author User
 */
public class Stud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("kholi","A1",9.5));
        list.add(new student("dhoni","A2",9.7));
        list.add(new student("samson","A3",9.6));
        list.add(new student("rishab","A4",9.94));
        list.add(new student("shreyas","A5",9.4));
        list.add(new student("vshankar","A6",9.56));
        list.add(new student("wsundar","A7",8.9));
        list.add(new student("chahal","A8",8.8));
        list.add(new student("shiny","A9",8.7));
        list.add(new student("manesh","A10",8.63));
        list.add(new student("rohit","A11",9));
        list.add(new student("hardik","A12",9.8));
        list.add(new student("kuranal","A13",9.2));
        list.add(new student("deepakc","A14",8.4));
        list.add(new student("rahulc","A15",8.75));
        list.add(new student("dk","A16",9.67));
        list.add(new student("buvi","A17",8.32));
        list.add(new student("bumrah","A18",9.14));
        list.add(new student("jadeja","A19",9.36));
        list.add(new student("kedar","A20",9.59));
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("\nName in Descending Order:"+list);
        // TODO code application logic here
    }
    
}
class student
{
    String name,rollno;
    double cgpa;
    student(String n,String r,double c)
    {
        name=n;
        rollno=r;
        cgpa=c;
    }
    public String toString()
    {
        return "\nStudent Name:"+name+"\tRoll No:"+rollno+"\tCgpa:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        return s2.name.compareTo(s1.name);
    }
}