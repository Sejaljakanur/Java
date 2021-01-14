import java.util.Scanner;
public class assignment3 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n1=s1.nextInt();
		int rem=0,max=0;
		while(n1>0)
		{
			 rem=n1%10;
			 if(rem>=max)
			 {
			 max=rem;
			 }
			 n1=n1/10;
		}
		System.out.println("The maximum digit="+max);
             }

}
