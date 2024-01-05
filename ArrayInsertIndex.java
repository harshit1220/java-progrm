import java.util.*;
class ArrayInsertIndex
{
	public static void main(String[]args)
	
	{
		int arr[]={10,20,30,40,50,60,70};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int no=sc.nextInt();
		int newArr[]=new int[arr.length+no];
		System.out.println("which index you want to insert the element: ");
		int indx=sc.nextInt();
		int newindx=0;
		if((indx<=arr.length)&&(indx>=0))
		{
			for(int i=0;i<indx;i++,newindx++)
			{
				newArr[i]=arr[i];
			}
			
			//inserting ele from user
			for(int i=1;i<=no;i++)
			{
				System.out.println("Enter the "+i+" element: ");
				newArr[newindx++]=sc.nextInt();
			}
			
			int oldindx=indx;
			for(int i=indx+no;i<newArr.length;i++)
			{
				newArr[i]=arr[oldindx++];
			}
			System.out.println(Arrays.toString(newArr));
		}
	}
}