import java.io.*;
import java.util.*;
class Num
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        Num.java
        while(a>0)
        {
            int k=a%10;
            count++;
            a=a/10;
            
            
        }
        if(count>0)
        {
            System.out.println(count);
        }
    }
}
