import java.io.FileInputStream;
import java.io.FileOutputStream;

class Child extends Thread{
	public void run(){
		try{
		FileInputStream fin=new FileInputStream("f1.txt");
		FileOutputStream fout1 =new FileOutputStream("f2.txt");
		FileOutputStream fout2 =new FileOutputStream("f3.txt");					int i=fin.read();
		while(i!=-1){
			if(i>=97){fout1.write(i);}
			if(i>=65&&i<97){fout2.write(i);}
			i=fin.read();
		}
		fin.close();
		fout1.close();
		fout2.close();
		}
		catch(Exception e){System.out.print(e);}
	
	}
}
public class FileLab{
	public static void main(String args[]){
		Child c1= new Child();
		c1.start();
	}
}