
import java.util.Scanner;

public class Q4
{

	public static void main(String[] args)
	{
		
	double pop,lm,lw,im,iw,tl;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the total population of the city");
	pop=s1.nextDouble();
	tl=(pop*48)/100;
	lm=(pop*35)/100;
	lw=(pop*13)/100;
	im=(pop*17)/100;
	iw=(pop*35)/100;
	System.out.println("Total literacy="+tl+ " \t Literate men="+lm + "\t Literate women="+lw +
	"\t Iliiterate men="+im + "\t Illiterate women=" +iw);
		
		
		

	}

}
