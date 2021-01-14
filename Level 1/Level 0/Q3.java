import java.util.Scanner;

public class Q3
{

	public static void main(String[] args)
	{

		double inch,yards,feets;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the inches");
		inch=s1.nextDouble();
		yards=inch*0.027;
		feets=inch*0.083;
		System.out.println("The value in yards="+yards);
		System.out.println("The value in feets="+feets);

	}

}