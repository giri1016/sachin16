import java.io.*;
import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char cd=s.next().charAt(0);
        if(cd=='A'||cd=='a'||cd=='e'||cd=='E'||cd=='i'||cd=='I'||cd=='o'||cd=='O'||cd=='u'||cd=='U')
        {
            System.out.println("VOWELS");
        }
        else
        {
            System.out.println("CONSONANTS");
        }
    }
}
