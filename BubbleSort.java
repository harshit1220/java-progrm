//write a program to perform Bubble Sort

import java.util.*;
class BubbleSort
{
	public static void main(String[]args)
	{
		int[]a={7,2,3,5,7,8,10};
		int l=a.length;
		int temp=0;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}