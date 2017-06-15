import java.io.*;
import java.util.*;
class Hcf
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int temp=0;
        int min=Math.min(a,b);
        for(int i=min; i >= 1; i--)
            {
                if(a%i == 0 && b%i == 0)
                {
                    temp = i;
                    
                    break;
                }
            } 
        System.out.println(temp);
    }
}

