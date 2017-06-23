import java.util.*;
class Arms
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int count=0,sum=0,d;
        int a=s.nextInt();
        int b=a;
        int c=a;
        while(b>0)
        {
            b=b/10;
            count++;
        }
        while(a>0)
        {
            d=a%10;
            sum=(int) (sum+Math.pow(d,count));
            a=a/10;
            
        }
        if(sum==c)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not a Armstrong number");
        }
    }
}
