/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degree;

/**
 *
 * @author bhara
 */
public class Degree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        degrees a1=new degrees();
        a1.getdegree();
        a1=new undergraduate();
        a1.getdegree();
        a1=new postgraduate();
        a1.getdegree();
        // TODO code application logic here
    }
    
}
class degrees
{
    void getdegree()
    {
        System.out.println("I got a Degree");
    }
}
class undergraduate extends degrees
{
    @Override
    public void getdegree()
    {
        System.out.println("I am a Undergraduate");
    }
    
}
class postgraduate extends degrees
{
    @Override
    public void getdegree()
    {
        System.out.println("I am a Postgraduate");
    }
    
}