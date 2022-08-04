package DynamicProgramingPractice;
import java.util.ArrayList;
import java.util.Arrays;
public class AtosTest {
	static int  rates;  
	static String  city;
	
	public int getrates() {  
	    return rates;  
	    
	}  
	public void setrates(int rates) {  
	    this.rates = rates;  
	}  
	public String getcity() {  
	    return city;  
	    
	} 
	public void setcity(String city) {  
	    this.city = city;  
	}
	
	
	public static void main(String[] args) {
		
		AtosTest at =  new AtosTest();
		
		at.setrates(41);
		at.setcity("CSE");
		at.setrates(34);
		at.setcity("SSE");
		at.setrates(13);
		at.setcity("NSE");
		at.setrates(9);
		at.setcity("NSE");
		at.setrates(40);
		at.setcity("CSE");
		at.setrates(15);
		at.setcity("CSE");
		
		System.out.println(rates + " "+city);
		
		//ArrayList<String> lst = new ArrayList<>();
	//	lst.add(rates);
		
		
		
		
		
		
		
	}

}
