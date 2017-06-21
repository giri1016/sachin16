import java.util.*;
class Contains
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(s2.contains(s1))
        {
            System.out.println(s2);
        }
        else
        {
            System.out.println("false");
        }
    }
}
