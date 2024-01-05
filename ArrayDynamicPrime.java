import java.util.*;
class ArrayDynamicPrime
{
	public static void main(String[]args)
	{
		int no=10;
		int []primeNumber=primeNumber(no);
		System.out.println(Arrays.toString((primeNumber)));
	}
	
	public static int[] primeNumber(int no)
	{
		int []primeArray=new int[no];
		int cnt=0;
		for(int i=3;true;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				primeArray[cnt++]=i;
				if(cnt==no)
				{
					break;
				}
			}
		}
		return primeArray;
	}
}