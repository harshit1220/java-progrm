import java.util.*;
class ArrayReverse
{
	public static void main(String[]args)
	{
		int[]a={10,20,30,40,50,60,70,80};
		int[]rev=new int[a.length];
		
		for(int i=a.length-1,j=0;i>=0;i--)
		{
			rev[j++]=a[i];
		}
		System.out.println(Arrays.toString(rev));
	}
}