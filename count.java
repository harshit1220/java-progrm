import java.util.Scanner;
class count
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		int count=0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		
		System.out.println("Count of digit is: "+count);
	}
}