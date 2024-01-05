import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++)														//1<=3=true			//2<=3=true				//3<=3=true
		{
			if(num%i==0)															//3%1=0 true		//3%2=0 false			//3%3=0 true
			{
				count++;															//1											//2
			}
		}
		if(count==2)																			//2=2
		{
			System.out.println("Number is a prime number");										//print.
		}
		else
		{
			System.out.println("Number is not a prime");
		}
	}
}