import java.util.Scanner;
public class Q2
{

	public static void main(String[] args)
	{
		
     Scanner s1=new Scanner(System.in);
     double side,area;
     
     System.out.println("Enter side of the square");
     side=s1.nextDouble();
     area=side*side;
     
     System.out.println("Area of square is:"+area);
     
	}

}
