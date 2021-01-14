import java.util.Scanner;

public class assignment2
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
	float n1,n2;
	n1=Integer.parseInt(args[0]);
	n2=Integer.parseInt(args[1]);
	if(args.length==3)
		{
		if(args[2].equals("+"))
		{
			float add=n1+n2;
			System.out.println("Addition of two numbers:"+add);

		}
		if(args[2].equals("-"))
		{
			float sub=n1-n2;
			System.out.println("Subtraction of two numbers:"+sub);

		}
		if(args[2].equals("*"))
		{
			float mul=n1*n2;
			System.out.println("Multiplication of two numbers:"+mul);

		}
		if(args[2].equals("/"))
		{
			float div=n1/n2;
			float rem=n1%n2;
			System.out.println("For division of two numbers,Quotient="+div +"Remainder="+rem);

		}
		}
		else
		{
			System.out.println("Enter valid number of inputs");
		}

	}

}
