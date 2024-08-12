/*
java program to read n number using command line argument!!
*/
import java.util.*;

public class command{
	public static void main(String[]args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
		    sum=sum+Integer.parseInt(args[i]);
		}
	
		System.out.println("Sum= "+sum);
	}
}


/*
Command line argument:10 3 4 56 45 76 87
Sum= 281
*/