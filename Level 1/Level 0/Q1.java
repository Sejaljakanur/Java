import java.util.Scanner;

public class Q1
{

	public static void main(String[] args)
	{
		
		double width,height,area,perimeter;
		System.out.println("Enter height and width of the rectangle");
		
		Scanner s1=new Scanner(System.in);
		width=s1.nextDouble();
		height=s1.nextDouble();
		area=width*height;
		perimeter=2*width+2*height;
		
		System.out.println("Area of rectangle is "+area);
		System.out.println("Perimeter of rectangle is " +perimeter);
		
		

	}

}