/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author bhara
 */
public class second {
    public void sectohour(int s)
    {
        int p1=s/(60*60);
        System.out.println("Second to Hour:"+p1);
    }
    public void sectomin(int s)
    {
        int p2=s/60;
        System.out.println("Second to Minute:"+p2);
    }
}
