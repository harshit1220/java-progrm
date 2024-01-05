import java.util.Arrays;
class MergeArray
{
	public static void main(String[]args)
	{
		int a[]={10,20,30,40};
		int b[]={50,60,70,80,90,100};
		int newArr=new int[(a.length)+(b.length)];
		
		int indx=0;
		for(int i=0;i<newArr.length;i++)
		{
			if(i<a.length)
			{
				newArr[i]=a[i];
			}
			else{
				newArr[i]=b[indx++];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}