class ArrayOddEven
{
	public static void main(String[]args)
	{
		byte[]arr={1,2,3,4,5,6,7,127};
		int evenSum=0;
		int oddSum=0;
		int i=0;
		
		while(i<arr.length)
		{
			int num=arr[i];
			if(num%2==0)
			{
				evenSum+=num;
			}
			else{
				oddSum+=num;
			}
			i++;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}