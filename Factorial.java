import java.io.*;
import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int result=1;
        for(int i=1;i<=a;i++)
        {
            result=result*i;
            
        }
        System.out.println(result);
    }
}
