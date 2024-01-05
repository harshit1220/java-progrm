import java.util.Arrays;
class ArrayDuplicate2D
{
	public static void main(String[]args)
	{
		int[][]arr={{122,24,58},{457,22,152,444}};
		
		int[][]dup=new int[arr.length][];
		
		for(int i=0;i<arr.length;i++)
		{
			dup[i]=new int[(arr[i].length)];
			
		}	
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				dup[i][j]=arr[i][j];
			}
		}			
		System.out.println(Arrays.deepToString(dup));
	}
}