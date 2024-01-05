
import java.util.Arrays;
public class ArrayCreation {

	public static void main(String[] args) {

		
		//-------------------4th array----------------------
        char[][][] c=new char[4][][];
        c[0]=new char[1][4];
        c[1]=new char[2][1];
        c[2]=new char[1][3];
        c[3]=new char[2][];
        c[3][0]=new char[1];
        c[3][1]=new char[2];
		
		c[0][0][0]='A';
		c[0][0][1]='B';
		c[0][0][2]='C';
		c[0][0][3]='D';
		c[1][0][0]='E';
		c[1][1][0]='F';
		c[2][0][0]='G';
		c[2][0][1]='H';
		c[2][0][2]='I';
		c[3][0][0]='J';
		c[3][1][0]='K';
		c[3][1][1]='L';
		
		System.out.println(Arrays.deepToString(c));
		
		
        //-------------------5th array----------------------
        //String[][][] s=new String[3][][];
        //s[0]=new String[1][3];
        //s[1]=new String[2][1];
        //s[2]=new String[3][];
        //s[2][0]=new String[1];
        //s[2][1]=new String[2];
        //s[2][2]=new String[3];
		
		
		String s [][][]={{{"ab","bc","cd","de"}},{{"ef"},{"fg"}},{{"gh"},{"hi","ij"},{"jk","kl","lm"}}};
		System.out.println(Arrays.deepToString(s));




	}

}
