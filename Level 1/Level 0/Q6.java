import java.util.Scanner;
public class Q6 
{

	public static void main(String[] args)
	{
		
		Scanner s1=new Scanner(System.in);
		String bkname="";
		int bkprice=0,bkno=0;
		while(true)
		{
		System.out.println("1.Add book [Book No, Book Name, Book price] \n2.Display book \n3.Search book \n4.exit");
		System.out.println("Enter your choice");
		int choice=s1.nextInt();
		switch(choice)
		{
	
			case 1:
				System.out.println("Enter book no,Book name and book price");
	       bkno=s1.nextInt();
	       bkname=s1.next();
	       bkprice=s1.nextInt();
	       break;
			case 2:
				System.out.println("The book details are as follows:");
				System.out.println("BookNo="+ bkno);
				System.out.println("BookName="+bkname);
				System.out.println("BookPrice="+bkprice);
				break;
			case 3:
				break;
			case 4:
				return;
				default:
					System.out.println("Enter valid option");
				
	       
		}
		}
				
}

}