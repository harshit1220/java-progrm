interface Interf
{
	int add(int a, int b);
}

class Demo
{
	public static void main(String[]args)
	{
		
		Interf num=(a,b)-> a+b;
		System.out.println(num.add(3,3));
		
	}
}