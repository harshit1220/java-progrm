class ArrayInsert
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int[]arr={10,20,30,40};
		System.out.println("Enter a number of lement which you want to insert");
		int sz=sc.nextInt();
		int[]newArr=new int[arr.length+sz];
		
		//pointer for indx pf newArr
		int indx=0;
		
		//copying elements from old array to new array
		for(int num:arr)
		{
		newArr[indx++]=num;
		}
		
		for(int i=1;i<=sz;i++)
		{
			
			System.out.println("Enyer the "+i+"Element: ");
			newArr[indx++]=sc.nextInt();

		}
		System.out.println(Arrays.toString(newArr));
	}
}