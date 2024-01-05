import java.util.*;
class ArraySeries1	
{
	public static void main(String[]args)
	{
		int[]numbers=new int[10];
		int num1=24;
		numbers[0]=num1;
		
		for(int i=0;i<10;i++)
		{
			numbers[i]=(num1*2)-(8*i);
			num1=numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
	}
}