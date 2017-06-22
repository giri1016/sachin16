import java.io.*;
import java.util.*;
class Prime1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int flag=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.println(" not a Prime Number");
                flag=1;
                break;
            }
            
        }
        if(flag==0)
            {
                System.out.println("Prime Number");
            }
    }
}

