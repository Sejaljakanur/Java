
import java.util.Scanner;

public class Q9 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		int sal[]=new int[5];
		int totalsal[]=new int[5];
		int temp[]=new int[5];
		String name[]=new String[5];
		int choice,DA,HRA,CCA;
		while(true) {
		System.out.println("\n1.Add employee\n2.Calculate gross salary \n3.Display details");
		System.out.println("Enter your choice");
		choice=s1.nextInt();
		switch(choice)
		{
		case 1:
		
		System.out.println("Enter the employee name and salary for 5 employees");
		for(int i=0;i<sal.length;i++)
		{
			name[i]=s1.next();
			sal[i]=s1.nextInt();
		}
		break;
		case 2:
		for(int i=0;i<sal.length;i++)
		{
			DA=(sal[i]*15)/100;
			HRA=(sal[i]*16)/100;
			CCA=(sal[i]*21)/100;
			temp[i]=DA+HRA+CCA;
			totalsal[i]=sal[i]+temp[i];
		}
		break;
		case 3:
			System.out.println("The details of employees are as follows:");
			for(int i=0;i<5;i++)
			{
				System.out.println("Employee name="+name[i]);
				System.out.println("Employee salary="+sal[i]);
				System.out.println("Employee Gross salary="+totalsal[i]);
			}
			break;
		case 4:
			return;
			default:
				System.out.println("enter valid option");
		}
		}
	
	}
}
