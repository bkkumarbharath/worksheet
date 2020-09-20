/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

/**
 *
 * @author bhara
 */
public class minute {
    public void mintohour(int m)
    {
        int p1=m/60;
        System.out.println("Minute to Hour:"+p1);
    }
    public void mintosec(int m)
    {
        int p2=m*60;
        System.out.println("Minute to Second:"+p2);
    }
}
