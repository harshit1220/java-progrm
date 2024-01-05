import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		
		System.out.println("Sum of digit is: "+sum);
	}
}