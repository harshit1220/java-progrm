import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{	
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=var.nextInt();
		int dup=num;
		int count=count(num);
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			num/=10;
		}
		if(sum==dup)
		{
			System.out.println("Number is an armstrong number");
		}
		else
		{
			System.out.println("Number is not an armstrong number");
		}
		
	}
	
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
}