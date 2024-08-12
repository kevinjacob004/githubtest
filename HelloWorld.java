import java.util.*;

class Fact extends Thread{
    int n,f=1;
    public synchronized void run(){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is: "+f);
        
    }
}

class Sum extends Thread{
    int n,sum=0,j;
    public synchronized void run(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of terms to be added:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
                    System.out.println("Enter the number");
                    j=sc.nextInt();
                    sum=sum+j;
        }
        System.out.println("Sum="+sum);
        
    }
}

class HelloWorld {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2==0){
             Fact f=  new Fact();
	f.start();
	try{
		f.join();
	}
	catch(Exception e){
	
	}
            }
            else{
              Sum s=  new Sum();
               s.start();
	try{
		s.join();
	}
	catch(Exception e){
	
	}
             }
        }
    }
}