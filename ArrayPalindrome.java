class ArrayPalindrome
{
	public static void main(String[]args)
	{
		String[] names={"ramesh","mahesh","nitin","naman"};
		
		for(String name:names)
		{
			if(isPalindrome(name))
			{
				System.out.println(name);
			}
		}
	}
	public static boolean isPalindrome(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(rev.equals(name))
		{
			return true;
		}
		else{
			return false;
		}
		
	}
}