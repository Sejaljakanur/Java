import java.util.Scanner;

public class Q8
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int sum=0,fact=1;
		int []arr=new int[5];

		System.out.println("entre any five numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				sum=sum+arr[i];
			}
			else if(arr[i]%2==0)
			{
				for(int j=1;j<=arr[i];j++)
				{
					fact=fact*j;

				}
				System.out.println("The factorial of "+arr[i]+" is\t"+fact);
				fact=1;
			}
		}
		System.out.println("The sum of numbers divisible by 3="+sum);

		}

}