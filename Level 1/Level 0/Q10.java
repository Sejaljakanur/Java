import java.util.Scanner;

public class Q10
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int id[]=new int[5];
		double bsc[]=new double[5];
		double gsc[]=new double[5];
		System.out.println("Enter the details of employee:\n1.EmployeeId\n2.Basic salary of employee");
		for(int i=0;i<5;i++)
		{
			id[i]=s1.nextInt();
			bsc[i]=s1.nextDouble();
		}
		for(int i=0;i<5;i++)
		{
			if(bsc[i]>=15000)
			{
				gsc[i]=(bsc[i]*15)/100;
				
			}
			else if(bsc[i]>=10000)
			{
				gsc[i]=(bsc[i]*7)/100;
			}
			else if(bsc[i]<5000)
			{
				gsc[i]=(bsc[i]*12)/100;
			}
		}
		System.out.println("Gross salary of all the employees=");
		for(int i=0;i<5;i++)
		{
			System.out.println("Gross salary of employee with id"+id[i]+"having basic salary="+bsc[i]+"is"+gsc[i]);
			
		}

	}

}
