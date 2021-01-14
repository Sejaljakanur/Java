import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class assignment4

{
public static void main(String[] args)
{
		@SuppressWarnings({ "unused", "resource" })
		Scanner s1=new Scanner(System.in);
		String myarr[]=new String[5];
		String prg[]=new String[5];
		for(int i=0;i<5;i++)
		{
			myarr[i]=args[i];
		}
		Arrays.sort(myarr);
		System.out.println("After Sorting,");
		System.out.println(Arrays.toString(myarr));


	}

}