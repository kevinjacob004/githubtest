class fib extends Thread
{
    public void run()
    {
   int a=0,b=1,i,c;
   System.out.println(+a);
   System.out.println(+b);
   for(i=0;i<10;i++)
   {
       c=a+b;
       System.out.println(+c);
       a=b;
       b=c;
   }
    }
}
class rev extends Thread
{
   public void run(){
    int i;
    for(i=10;i>0;i--)
    {
        System.out.println(+i);
    }}
}
class print
{
    public static void main (String args[])
    {
        fib f1=new fib();
        rev r1=new rev();
        f1.start();
        try
        {
            f1.join();
        }
        catch(Exception e)
        {
            System.out.println("exception caught ");
        }
       r1.start();
    }
}