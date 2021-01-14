import java.util.Scanner;

public class assignment9 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		Object a1[]=new Object[10];
		a1=enrollStudent();
		int num;
		num=validateInput(a1);
		if(num==-1)
			System.out.println("Student Registration is Successful");
		else if(num==101)
			System.out.println("Invalid Name");
		else if(num==102)
			System.out.println("Invalid Quaification");
		else if(num==103)
			System.out.println("Invalid Scored Marks");
		else if(num==104)
			System.out.println("Invalid University Name");
		else
			System.out.println("Error 404");
		

	}
public static Object[] enrollStudent()
{
	String sname,highquali,uniname;
	float scoredmar;
	Scanner s1=new Scanner(System.in);
	Object arr[]=new Object[10];
	System.out.println("Enter name of the student");
	sname=s1.next();
	System.out.println("Enter Highest qualification of student");
	highquali=s1.next();
	System.out.println("Enter the marks scored by student");
	scoredmar=s1.nextFloat();
	System.out.println("Enter the university name");
	uniname=s1.next();
	arr[0]=sname;
	arr[1]=highquali;
	arr[2]=scoredmar;
	arr[3]=uniname;
	validateInput(arr);
	return arr;
}
public static int validateInput(Object y[])
{
	String nm,h,u;
	float sm;
	int count=0,count1=0;
	boolean n=false,q=false,s=false,uni=false;
	nm=(String)y[0];
	h=(String)y[1];
	sm=(float)y[2];
	u=(String)y[3];
	boolean res=false;
	for(int i=0;i<nm.length();i++)
	{
	if(nm.charAt(i)>=33 && nm.charAt(i)<=64)
		count=0;
		else
			count++;
		}
	if(count==nm.length())
		n=true;
	if(h.equalsIgnoreCase("hsc")|| h.equalsIgnoreCase("SSC")||h.equalsIgnoreCase("graduate")||h.equalsIgnoreCase("postgraduate"))
	q=true;
    if(sm>=1 && sm<=100)
   s=true;
    for(int j=0;j<u.length();j++)
    {
    
    	if(u.charAt(j)>=33 && u.charAt(j)<=64) {
    		if(u.charAt(j)==46)
    			count1++;
    		else
    		count1=0;}
    	else
    		count1++;
    		}
    if(count1==u.length())
    	uni=true;
    if(n && q && s && uni)
    return -1;
    else
    {
    	if(n!=true)
    		return 101;
    	else if(q!=true)
    		return 102;
    	else if(s!=true)
    		return 103;
    	else if(uni!=true)
    		return 104;
    }
    return 0;
	
}

}
