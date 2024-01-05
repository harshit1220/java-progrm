import java.util.*;
class ArrayZigZag
{
	public static void main(String[]args)
	{
		int[]a={10,20,30,40,50,60};
		int[]b={70,80,90};
		
		int[]newarr=new int[a.length+b.length];
		
		int indx=0;
		for(int i=0;i<newarr.length;i++)
		{
			if(i<a.length)
			{
				newarr[indx++]=a[i];
			}
			if(i<b.length)
			{
				newarr[indx++]=b[i];
			}
			
		}
		System.out.println(Arrays.toString(newarr));
	}
}