
import java.util.Scanner;
public class assignment8 
{
	public static void main(String[] args) 
	{
		
		Object []myobj= new Object[10];
		myobj=takeConstructionData();
		submitConstructionData(myobj);

	}
	public static Object[] takeConstructionData()
	{
		Scanner s1=new Scanner(System.in);
		String construction_name;
		float area_in_sqft;
		int estimate_timeindays;
		float estimate_cost_in_dollars;
		Object []a1= new Object[10];
		System.out.println("Enter construction_name ");
		construction_name=s1.next();
		System.out.println("Enter area_in_sqft");
		area_in_sqft=s1.nextFloat();
		System.out.println("Enter estimate_timeindays");
		estimate_timeindays=s1.nextInt();
		System.out.println("Enter estimate_cost_in_dollars ");
		estimate_cost_in_dollars=s1.nextFloat();
		a1[0]=construction_name;
		a1[1]=area_in_sqft;
		a1[2]=estimate_timeindays;
		a1[3]=estimate_cost_in_dollars;
		
		return a1;
	}
	public static void  submitConstructionData(Object x[])
	{
		int time;
		float servicechrg=0;
		float amt=(float)x[3];
		float totalamt;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=null)
			System.out.println(x[i]);
		}
		
	time=(int)x[2];
	if(time>=300) {
		servicechrg=(10*amt)/100;
		System.out.println("Service charge applied="+servicechrg);
	totalamt=servicechrg+amt;
	System.out.println("Total amount after service charges="+totalamt);

	
	}
	}
	}


