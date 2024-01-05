import java.util.Arrays;
class ArrayDuplicateClone
{
	public static void main(String[]args)
	{
		char[]characters={'a','b'};
		char[]dup=characters.clone();
		System.out.println(Arrays.toString(dup));
	}
}