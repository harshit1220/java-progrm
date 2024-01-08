import java.util.*;
class ArrayOddEven2
{
	public static void main(String[]args)
	{
		int ar[]={1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(odd(ar)));
		System.out.println(Arrays.toString(even(ar)));
	}
	
	public static int[] even(int[] ar)
	{
		int even[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even[i]=ar[i];
			}
		}
		return even;
	}
	
	public static int[] odd(int[] ar)
	{
		int odd[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				odd[i]=ar[i];
			}
		}
		return odd;
	}
}