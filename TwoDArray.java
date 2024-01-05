class TwoDArray
{
	public static void main(String[]args)
	{
		String [][] arr={{"a","b"},{"c"},{"d","e","f"}};
		
		//using for loop
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//using while loop
		
		int j=0;
		while(j<arr.length)
		{
			int k=0;
			while(k<arr[j].length)
			{
				System.out.print(arr[j][k]+" ");
				k++;
			}
			j++;
		}
		
			System.out.println("------------------------------------------------------");
		
		//using for each
		for(String []x:arr)
		{
			for(String y:x)
			{
				System.out.print(y+" ");
			}
			
		}
		System.out.println("------------------------------------------------------");
		
		//using do while
		
		int k=0;
		do{
			
			int l=0;
			do{
				System.out.print(arr[k][l]+" ");
				l++;
			}while(l<arr[k].length);
			k++;
		}while(k<arr.length);
	}
}