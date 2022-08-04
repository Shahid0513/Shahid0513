package infosys;

import java.util.*;

public class DigitalOTP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String res ="";
		
		for(int i=1;i<num.length() && res.length() < 4;i=i+2)
		{//if(i%2==0) {
			char ch =num.charAt(i);
			int i1 = Character.getNumericValue(ch);
			//if()
			int sq = i1*i1;
			
			res=res+sq;
		}
			
		//}
				System.out.println(res.substring(0,4));
	}

}
