import java.io.*;
import java.util.*;
public class Leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        if(a%4==0)
        {
            System.out.println("Leap year");
        }
        
        
        else
        {
            System.out.println("Not a Leap year");
        }
        
    }
}
