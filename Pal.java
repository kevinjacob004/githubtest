import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.io.*;

class FileeReader extends Thread{
	public void run(){
		try{
			FileInputStream fin= new FileInputStream("f1.txt");
			FileOutputStream fout=new FileOutputStream("f2.txt");
			        String s="",a,b;
        int count=0;
        char c;
        String dup ="";
int i;
i=fin.read();
while(i!=-1)
{
	char ch= (char)i;
	s=s+ch;
	i=fin.read();
}
System.out.println(s);
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
            for( i=0;i<s.length();i++)
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
		catch (Exception e){System.out.print(e);}	
	}

}

class Pal{
public static void main(String[]args){
	FileeReader f1 =new FileeReader();
	f1.start();
}
}