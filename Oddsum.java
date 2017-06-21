import java.util.*;
class Oddsum
{
    public static void main(String args[])
    {
        int i;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0,sum1=0;
        int x[]=new int[(b-a)+2];
        
        for(i=1;i<(b-a)+2;i++)
        {
            sum=sum+1;
            x[i]=sum;
            if(x[i]%2==1)
            {
                sum1=sum1+x[i];
            }
        }
        System.out.print(sum1);
    }
}
