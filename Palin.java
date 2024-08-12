import java.util.*;
import java.io.*;
class Palin{
    public static void main(String[] arg)
    {
        String s,a,b;
        int count=0;
        char c;
        Scanner sc=new Scanner(System.in);
        String dup ="";
        System.out.println("Enter String: ");
        s=sc.nextLine();
        a=s;
        StringBuffer sbf=new StringBuffer(s);
        sbf.reverse();
        if(a.equals(sbf.toString()))
        {
            System.out.println("It is a palindrome!");
        }
        else
        {
            System.out.println("not palindrome!");
            for(int i=0;i<s.length();i++)
            {
                count=0;
                c=s.charAt(i);
                for(int j=0;j<s.length();j++)
                {
                    if(c==s.charAt(j))
                    {
                        count++;
                    }
                }
                System.out.println("Occurence of "+c+" : "+count);
                
                if(dup.indexOf(String.valueOf(c))==-1)
                {
                    dup=dup+c;
                }
                System.out.println("String without duplicates: "+dup);
            }
        }
    }
}