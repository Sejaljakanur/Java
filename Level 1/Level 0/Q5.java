import java.util.Scanner;

public class Q5
{

	public static void main(String[] args)
	{
		
		double price,qty,Billamt;
		Scanner s1=new Scanner(System.in);
		
       System.out.println("Enter the price of the product");
       price=s1.nextDouble();
       
       System.out.println("Enter the Quantity of the product");
       qty=s1.nextDouble();
       Billamt=price*qty;
       
       System.out.println(" The total Bill Ammount= "+Billamt);
	}

}