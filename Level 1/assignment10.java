import java.util.Arrays;
import java.util.Scanner;
public class assignment10
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		Object obj[]= {1,"Sejal",78.5,2,"Monica",96.3,3,"Joey",9,98.4};
		getIntegerValues(obj);
		getFloatValues(obj);
		getStringValues(obj);
		}
	public static void  getIntegerValues(Object x[])
	{
		int arr[]=new int[10];
		int j=0;
		for(int i=0;i<x.length;i++)
		{
	         if(x[i] instanceof Integer) {
				arr[j]=(int) (x[i]);
				j++;}
			}
		System.out.println("Integer values from object array are:");
		for(int k=0;k<j;k++)
			System.out.println(arr[k]);
		}
	public static void getFloatValues(Object y[])
	{
		double frt[]=new double[10];
		int j=0;
		for(int i=0;i<y.length;i++)
		{
			if(y[i] instanceof Double){
				frt[j]=(double)(y[i]);
				j++;}
		}
		System.out.println("Float values from object array are:");
		for(int k=0;k<j;k++)
			System.out.println(frt[k]);

		}
	public static void getStringValues(Object z[])
	{
		String srt[]=new String[10];
		int j=0;
		for(int i=0;i<z.length;i++)
		{
			if(z[i] instanceof String){
				srt[j]=(String)(z[i]);
				j++;}
		}
		System.out.println("String values in Object array are:");
		for(int k=0;k<j;k++)
			System.out.println(srt[k]);
	}

	}
