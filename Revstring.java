import java.util.*;
class Revstring
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s2=s.next();
        StringBuffer s1=new StringBuffer(s2);
        s1.reverse();
        System.out.println(s1);
    }
    
}
