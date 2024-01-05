class ArrayPrime
{
	public static void main(String[]args)
	{
		int[]arr={1,2,3,4,5,6,7,8,9,0,11};
		
		for(int num:arr)
		{
			int returnvalue=isPrime(num);
			
			if(returnvalue!=0)
			{
				System.out.println(returnvalue+" ");
			}
		}
		
	}
	public static int isPrime(int num)
	{
		if(num<=1)
		{
			return 0;
		}
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			return num;
		}
		return 0;
	}
}