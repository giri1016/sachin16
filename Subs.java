import java.util.*;
class Subs
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(s1.contains(s2))
        {
            System.out.println(s2);
        }
        else
        {
            System.out.println("false");
        }
    }
}
