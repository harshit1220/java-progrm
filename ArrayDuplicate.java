import java.util.Arrays;
class ArrayDuplicate
{
	public static void main(String[]args)
	{
		int[]arr={1,2,3,4,5,7};
		int[]dup=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			dup[i]=arr[i];
		}
		System.out.println(Arrays.toString(dup));
	}
}