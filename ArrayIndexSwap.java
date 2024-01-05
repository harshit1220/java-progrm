import java.util.*;
class ArrayIndexSwap
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,40,50,60};
		System.out.println("Enter index 1: ");
		int indx1=sc.nextInt();
		System.out.println("Enter index 2: ");
		int indx2=sc.nextInt();
		
		if((indx1>=0&&indx1<arr.length)&&(indx2>=0&&indx2<arr.length))
		{
			int temp=arr[indx2];
			arr[indx2]=arr[indx1];
			arr[indx1]=temp;
			System.out.println(Arrays.toString(arr));
		}
		else{
			System.out.println("Invalid INDEX");
		}
	}
}