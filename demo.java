package dsaproblemsolving;

import java.util.Scanner;

public class demo {
	
	public static String addtwoBStr(String a, String b) {
		
        StringBuilder result = new StringBuilder();
        
        int i = a.length()-1, j = b.length()-1;
        int carry = 0;
       
       
        	//for(int i =a.length()-1,j=b.length()-1;i>=0 && j>=0;i--;j--;) {}
        while(i >= 0 || j >= 0)
        {
        	int sum = carry;
            if(i >= 0) 
            	sum += a.charAt(i--) - '0';
            if(j >= 0) 
            	sum += b.charAt(j--) - '0';
            
            carry = sum > 1 ? 1 : 0;
            result.append(sum%2);
        }
       
        if(carry != 0) 
        	result.append(carry);
        return result.reverse().toString();
    }

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	String a=sc.next();
	String b=sc.next();
	System.out.println(addtwoBStr(a,b));
}

	
	}
