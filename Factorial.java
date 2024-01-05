import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		//int num=5;
		int fact=1;
		
		while(num>0)
		{
			fact= fact*num;
			num--;
		}
		System.out.println("Factorial of a number is: "+fact);
	}
}