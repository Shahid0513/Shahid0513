import java.math.BigInteger;
public class Divisibleby_7 {

	
		
		static int isDivisible(String num)
		{
			BigInteger holder = new BigInteger(num);
			BigInteger seven = BigInteger.valueOf(7);
			BigInteger rem = holder.mod(seven);
			
			if(rem == BigInteger.ZERO)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		

	}
		public static void main(String[] args) {
			System.out.println(isDivisible("43625483736333333444444676567343453428234532643642343234543834344782722477777777714"));
}
		
}
