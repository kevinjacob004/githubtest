/*
Write a Java program to illustrate variable length arguments.
*/

public class vargeExample{
    
    public int sumNum(int...args)
    {
        System.out.println("Argument length= "+args.length);
        int sum=0;
        for(int x:args)
        {
            sum+=x;
        }
    
        return sum;
    }
    
    public static void main(String[] args)
    {
        vargeExample ex=new vargeExample();
        int sum1=ex.sumNum(2,4);
        System.out.println("Sum="+sum1);
        int sum2=ex.sumNum(1,3,5);
        System.out.println("Sum="+sum2);
        
    }
}

/*
Argument length= 2
Sum=6
Argument length= 3
Sum=9
*/