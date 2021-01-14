import java.util.Scanner;
public class Q7 
{

	public static void main(String[] args)
	{
		
       
       System.out.println("Even numbers between 1 to 100:");
       for(int i=1;i<=100;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.print("\t"+i);
    	   }
       }
       System.out.println("\n Odd numbers between 101 to 200:");
       for(int j=101;j<=200;j++)
       {
    	   if(j%2==1)
    	   {
    		   System.out.print("\t"+j);
    	   }
       }
    	   

	}

}
