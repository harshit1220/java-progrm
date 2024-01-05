//write a program to perform Selection Sort

import java.util.*;
class SelectionSort
{
	public static void main(String[]args)
	{
		int[]a={7,2,3,5,7,8,10};
		int l=a.length;
		int temp=0;
		int pos=0;
		for(int i=0;i<l;i++)
		{
		pos=i;
			for(int j=i+1;j<l;j++)
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}
			temp=a[pos];
			a[pos]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}