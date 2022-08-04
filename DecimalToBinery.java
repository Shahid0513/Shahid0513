package Map;

import java.util.*;

public class DecimalToBinery {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int decimal = sc .nextInt();
		
		int q = decimal/2;
		int rem = decimal%2;
	    String binery = rem+ "";
		
	    while( q >= 2)
		{
			
			rem=q%2;
			binery = rem+ binery;
			q=q/2;
		}
		if(q<2)
		{
			binery = q+binery;
		}
		System.out.println(binery);
		 
		
		// using inbuilt method.
		
		
		//int dec= sc.nextInt();
		 
	//	System.out.println(Integer.toBinaryString(dec));  
		
		//System.out.println(Integer.toString());
	}

}
