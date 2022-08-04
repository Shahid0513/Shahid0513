package infytq;
import java.util.*;
public class NearestGreatestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s =sc.next();
		//String s2 = s.r
		//Collections.reverse(s);
		int len = s.length();
		int zeroIndex =-1;
		if(len % 2 == 0)
		{
			zeroIndex = len / 2;
		}
		else
		{
			zeroIndex = (len / 2) + 1;
		}
		System.out.println(zeroIndex);
		boolean isLastofZerros  = true;
		for(int i = 0; i < len; i++)
		{
			if(s.charAt(zeroIndex) != '0')
			{
				isLastofZerros = false;
				break;
			}

		}
		System.out.println(isLastofZerros);
		
		String firstHalf = s.substring(0 , len/2);
		System.out.println(firstHalf);
		
		if(isLastofZerros == false )
		{
			int c = Character.getNumericValue(s.charAt(len/2));
			c++;
			
			
			//
		}
		String revfirstHalf = new StringBuffer(firstHalf).reverse().toString();
		System.out.println(firstHalf);

	}

}
