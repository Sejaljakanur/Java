	import java.util.Scanner;

public class assignment7
{

	public static void main(String[] args)
	{
		String arr[]=new String[5];
		String arr1[]=new String[5];

		Scanner s1=new Scanner(System.in);
		System.out.println("enter 5 string values");
		for(int i=0;i<5;i++)
		{
			arr[i]=s1.nextLine();
		}

		  arr1=symbolnum(arr);
		  System.out.println("Here I found the String values which not contains Symbols and numbers");
		  for(int v=0;v<arr1.length;v++)
		  {
			  if(arr1[v]!=null)
		  System.out.println(arr1[v]);

		  }


	}
public static String[] symbolnum(String x[])
{
	String myarr[]=new String[5];
	int count=0;
	for(int i=0;i<x.length;i++)
	{
		count=0;
		for(int j=0;j<x[i].length();j++)
		{

	   if(x[i].charAt(j)>=33 && x[i].charAt(j)<=64 )
				count=0;
	   else
		 count++;
		}
	   if(count==x[i].length())
		   myarr[i]=x[i];
	}



	return myarr;
}
}
