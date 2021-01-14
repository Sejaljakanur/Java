
import java.util.Scanner;

public class assignment5 
{

	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two numbers");
		n1=s1.nextInt();
		n2=s1.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			System.out.println("\t"+i);
		}
		System.out.println("Enter your Choice:");
		System.out.println("1.Even Numbers");
		System.out.println("2.Prime Numbers");
		System.out.println("3.Palindrome Numbers ");
		int choice=s1.nextInt();
		int count=0;
		switch(choice)
		{
		case 1:
			for(int i=n1;i<=n2;i++)
			{
				if(i%2==0)
				{
					System.out.println("\t"+i);
				}
			}
			break;
		case 2:
			for(int j=n1;j<=n2;j++)
			{
				//count=0;
				
				for(int d=1;d<=j;d++)
				{
					if(j%d==0)
					{
						count++;
					}
					if(count==2)
					{
						System.out.println("\t"+j);
						
					}
				}
			}
			break;
		case 3:
			
			for(int j=n1;j<=n2;j++)
			{
				int rev=0;
				int rem=0;
				System.out.println(""+j);
				int org=j;
				while(j>0)
				{
				
					rem=j%10;
					rev=rev*10+rem;
					j=j/10;
				}
				if(rev==org)
				{
					System.out.println(rev+"is palindrome number");
					
				}
				System.out.println("in for");
			}
			break;
			default:
				System.out.println("Enter valid choice20");
		}

	}

}
