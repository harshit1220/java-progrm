import java.util.Scanner;
class IntegerToRoman
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");																//4
		int number=sc.nextInt();
        System.out.println(convertToRoman(number));
    }

    public static String convertToRoman(int number) {
        String romanNumber = "";
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};	//{1,4,5,9,10,40,50,90,100,400,500,900,1000};						
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};	
		
		for (int i = 0; i < romanValues.length; i++) {			//0<13
            if(number>=romanValues[i])						//4>=0=true
			{
				number -= romanValues[i];						//4=4-0		//
				romanNumber+=romanSymbols[i];					//""=""+IV
				
			}
        }
		return romanNumber;
	}
}
