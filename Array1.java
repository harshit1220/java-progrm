import java.util.*;
class Array1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of data: ");
		
		int size= sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;arr.length;i++)
		{
			System.out.println("Enter the data "+(i+1)+" : ");
			int data=sc.nextInt();
			arr[i]=data;
		}
		System.out.println(Arrays.toString(arr));
	}
}