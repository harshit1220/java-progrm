import java.util.Scanner;
class Factors
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Factors of the number are: "+i);
			}
		}
	}
}