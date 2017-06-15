import java.io.*;
import java.util.*;
class Quit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        //String s1="quit";
        if(a=='Q'||a=='q')
        {
            System.exit(0);
        }
    }
}
