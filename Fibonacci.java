import java.io.*;
import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=-1;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
        
    }
}
