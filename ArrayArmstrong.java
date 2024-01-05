class ArrayArmstrong
{
	public static void main(String[]args)
	{
		isArmstrong(new int[]{153,255,45,233,371});
	}
	public static void isArmstrong(int []numbers)
	{
		for(int number:numbers)
		{
			int sum=0;
			int temp=number;
			int temp2=number;
			int count=0;
			
			while (temp!=0)
			{
				count++;
				temp/=10;
			}
			
			while(temp2!=0)
			{
				int rem=temp2%10;
				int power =1;
				for(int i=1;i<=count;i++)
				{
					power=power*rem;
				}
				sum+=power;
				temp2/=10;
			}
			if(number==sum)
			{
				System.out.println(number);
			}
		}
	}
}