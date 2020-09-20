/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproj;
import java.util.*;
/**
 *
 * @author bhara
 */
public class Softwareproj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car a1=new car();
        truck a2=new truck();
        a1.getcardetail();
        a1.show();
        a2.gettruckdetail();
        a2.show();
        // TODO code application logic here
    }
    
}
class automobile
{
    Scanner in=new Scanner(System.in);
    String maker,vechileidentificationnumber;
    float bluebookvalue;
    int year,passenger;
    public void getdetail()
    {
        System.out.println("Enter Maker:");
        maker=in.next();
        System.out.println("Enter Vechile Identfication Number:");
        vechileidentificationnumber=in.next();
        System.out.println("Enter Blue Book Value:");
        bluebookvalue=in.nextFloat();
        System.out.println("Enter Year:");
        year=in.nextInt();
        System.out.println("Enter passenger:");
        passenger=in.nextInt();
    }
}
class car extends automobile
{

    boolean warranty,imported;
    int topspeed,door;
    String size,reardoor;
    public void getcardetail()
    {
        System.out.println("Car Detail:");
        super.getdetail();
        System.out.println("Enter Warranty:");
        warranty=in.nextBoolean();
        System.out.println("Enter imported:");
        imported=in.nextBoolean();
        System.out.println("Enter size:");
        size=in.next();
        System.out.println("Enter rear door:");
        reardoor=in.next();
        System.out.println("Enter Topspeed:");
        topspeed=in.nextInt();
        System.out.println("Enter Door:");
        door=in.nextInt();
    }
    public void show()
    {
        System.out.println("==================================================");
        System.out.println("CAR INFORMATION:");
        System.out.println("maker:"+maker+"\n"+"Vechile Indentification Number:"+vechileidentificationnumber+"\n"+"Year:"+year+"\n"+"Passenger"+passenger+"\n"+"Blue Book Value:"+bluebookvalue+"\n"+"warranty:"+warranty+"\n"+"imported:"+imported+"\n"+"Size:"+size+"\n"+"Rear Door:"+reardoor+"Top Speed:"+topspeed+"\n"+"Door:"+door);
        System.out.println("==================================================");
    }
}
class truck extends automobile
{
    boolean topper;
    String wheels;
    int racks;
    void gettruckdetail()
    {
        System.out.println("Truck Detail:");
        super.getdetail();
        System.out.println("Enter Topper:");
        topper=in.nextBoolean();
        System.out.println("Enter Wheels:");
        wheels=in.next();
        System.out.println("Enter racks:");
        racks=in.nextInt();
    }
    public void show()
    {
        System.out.println("==================================================");
        System.out.println("TRUCK INFORMATION:");
        System.out.println("maker:"+maker+"\n"+"Vechile Indentification Number:"+vechileidentificationnumber+"\n"+"Year:"+year+"\n"+"Passenger"+passenger+"\n"+"Blue Book Value:"+bluebookvalue+"\n"+"topper:"+topper+"\n"+"Wheels:"+wheels+"\n"+"Racks:"+racks);
        System.out.println("==================================================");
    }
}