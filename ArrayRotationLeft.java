import java.util.*;
class ArrayRotationLeft
{
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[]a={7,4,6,5,2};
		System.out.println("Enter the rotation index: ");
		int indx=sc.nextInt();
		if(indx>=0&&indx<a.length)
		{
			for(int i=1;i<=indx;i++)
			{
				int last=a[a.length-1];
				for(int j=a.length-1;j<=0;j--)
				{
					a[j+1]=a[j];
				}
				a[0]=last;
			}
			System.out.println(Arrays.toString(a));
		}
		else{
			System.out.println("Wrong INDEX");
		}
	}
}