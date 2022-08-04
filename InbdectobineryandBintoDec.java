package Map;
import java.util.*;

public class InbdectobineryandBintoDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter decimal values");
		Integer decimal = sc.nextInt();
		
		String binery = Integer.toBinaryString(decimal);
		System.out.println(binery);
		
			System.out.println("enter decimal long");
			long declong = sc.nextLong();
			System.out.println(Long.toBinaryString(declong));
		
			System.out.println("enter b1 biary values");
			String b1 =sc.next();
			String b2 ="1111000000100101";
			String b3 ="1110011";
			
			System.out.println(Long.parseLong(b1,2));
			System.out.println(Integer.parseInt(b2,2));
			//System.out.println(Integer.parseInt(b2,2));
			
		
	}

}
