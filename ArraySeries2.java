import java.util.*;
class ArraySeries2		//18,24,84,294,798
{
	public static void main(String[]args)
	{
		int[]numbers=new int[10];
		int num=18;
		numbers[0]=num;
		
		for(int i=1,even=2;i<numbers.length;i++,even+=2)
		{
			int power=1;
			for(int j=1;j<=3;j++)
			{
				power=power*even;
			}
			int nextNum=numbers[i-1]+((power)-even);
			numbers[i]=nextNum;
		}
		System.out.println(Arrays.toString(numbers));
	}
}