/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrp;

/**
 *
 * @author User
 */
public class Nonrp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str=new String("gibhk");
        System.out.println("The given String:"+str);
        boolean found=false;
        int i,j;
        for(i=0;i<str.length();i++)
        {
            found=true;
            char c=str.charAt(i);
            for(j=0;j<str.length();j++)
            {
                if(c==str.charAt(j) && j!=i)
                {
                    found=false;
                    break;
                }
            }
            if(found)
            {
                System.out.println("The First non character in String : "+c);
                break;
            }
        }
        if(!found)
        {
            System.out.println("No single character found");
        }
        // TODO code application logic here
    }
    
}
