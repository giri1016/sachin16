import java.io.*;
import java.util.*;
public class Alphabet
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char s1=s.next().charAt(0);
        if(Character.isLetter(s1))
        {
            System.out.println("ALPHABET");
        }
        else
        {
            System.out.println("NOT AN ALPHABET");
        }
    }
}
