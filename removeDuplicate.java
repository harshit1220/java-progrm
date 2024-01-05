import java.util.*;
class Demo
{
    public static void main(String[]args)
    {
        String a=new String("Hippo");
        String op="";
        int[] ch=a.chars().distinct().toArray();
        for(int i:ch)
        op=op+(char)i;
    }
}