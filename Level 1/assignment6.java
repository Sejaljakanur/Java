import java.util.Scanner;
public class assignment6
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		float arr[]=new float[5];
		System.out.println("Enter five values");
		for(int i=0;i<5;i++)
		{
			arr[i]=s1.nextFloat();
		}
		System.out.println("Enter value to search");
		float search;
		search=s1.nextFloat();
		searchvalue(arr,search);
	}
	public static void searchvalue(float x[],float y)
	{
			int pos=0;
			float min;
			int min_pos;
			float d[]=new float[5];
			for(int i=0;i<x.length;i++)
			{
				if(x[i]==y)
				{
					pos=i;
					System.out.println(x[i]+"found at position "+pos);
				}
			}
			if(pos==0)
			{
				min=y;
				min_pos=0;
				for(int j=0;j<x.length;j++)
				{
					if(x[j]>y)
					{
						d[j]=x[j]-y;
						System.out.println(d[j]);
						if(d[j]<=min)
						{
							min=d[j];
							min_pos=j;
						}
					}
					else
					{
						d[j]=y-x[j];
						System.out.println(d[j]);	
						if(d[j]<=min)
						{
							min=d[j];
							min_pos=j;
						}
					}
				}
				System.out.println("Value not found but "+x[min_pos]+" is near to "+y+" it at position "+min_pos);
			}
		}
	}