import java.io.*;
import java.util.*;
class Revnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=0;
        
        while(a>0)
        {
            int k=a%10;
            temp=temp*10+k;
            a=a/10;
        }
        System.out.println(temp);
    }
}



