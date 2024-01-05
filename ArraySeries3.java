import java.util.*;
class ArraySeries3		//11,13,19,49,?
{
	public static void main(String[]args)
	{
		int[]numbers=new int[10];
		int num=11;
		numbers[0]=num;
		int k=1;
		for(int i=1;i<numbers.length;i++)
		{
			int power=1;
			for(int j=1;j<=i;j++)
			{
				power*=k;
			}
			int nextNum=numbers[i-1]+((power)+k);
			numbers[i]=nextNum;
			k++;
		}
		System.out.println(Arrays.toString(numbers));
	}
}