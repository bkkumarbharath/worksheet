/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.*;

/**
 *
 * @author User
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("cheetri");
        list.add("aman");
        list.add("dhoni");
        list.add("k.l.rahul");
        list.add("lungidi");
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("List:"+list);
        list.replaceAll(t->t.toUpperCase());
        list.replaceAll(t->t+"s");
        System.out.println("Plural:"+list);
        Collections.reverse(list);
        System.out.println("Reversed List:"+list);
        list.removeIf(t->t.endsWith("s"));
        System.out.println("Plural words removed:"+list);
        // TODO code application logic here
    }
    
}
