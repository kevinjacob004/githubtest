import java.io.*;
import java.io.FileInputStream;

class filee{
	public static void main(String[]args){
try{
	int i=0,wc=0,lc=0,ws=0,cc=0;
	FileInputStream fin=new FileInputStream("fruit.txt");
	while((i=fin.read())!=-1){
		cc=cc+1;
		if((char)i=='\n'||(char)i==' '){wc=wc+1;}
		if((char)i=='\n'){lc=lc+1;}
		if((char)i==' '){ws=ws+1;}
	} 
System.out.println("Character count= "+cc);
System.out.println("Wordcount= "+wc);
System.out.println("Line count= "+lc);
System.out.println("Whitespace= "+ws);
fin.close();}
catch(Exception e){System.out.println("Exception caught");}
}
}