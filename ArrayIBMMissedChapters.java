import java.util.*;
class ArrayIBMMissedChapters
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter chapter number: ");
		int chpt=sc.nextInt();

		System.out.println("Enter Start date: ");
		int strt=sc.nextInt();
		
		System.out.println("Enter End date: ");
		int last=sc.nextInt();
		
		
	
	}
	
	public static int missedChapter(int chpt, int strt, int last)
	
	{
		
		int[]chapters=new int[last+1];
		int chapter=0;
		int mcindx=0;
		int[]missedChap=new int[(last+strt)+1];
		
		for(int i=0;i<chapters.length;i++)
		{
			chapters[i]=chapter++;
			if(chapter==chpt)
			{
				chapter=0;
			}
		}
		
		for(int i=strt;i<=last;i++)
		{
			missedChap[mcindx++]=chapters[i];
		}
		int count=uniqueElements(missedChap);
		
		return count;
	}
	
	public static int uniqueElements(int[]ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			int j=0;
			for(;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				count++;
			}
		}
		
		return count;
	}
}