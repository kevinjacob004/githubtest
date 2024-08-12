import java.util.*;
class stringtok{
	public static void main(String[]args){
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	String str=sc.nextLine();
int dig=0,sum=0;
	StringTokenizer token=new StringTokenizer(str);
	System.out.println("Enter digits are: ");
	while(token.hasMoreTokens()){
		String s=token.nextToken();
		dig=Integer.parseInt(s);
		System.out.println(dig+ " ");
		sum=sum+dig;
	}System.out.println("Sum="+sum);
	}
}