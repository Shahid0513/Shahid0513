package Map;

import java.util.HashMap;
import java.util.*;

public class HashMApDemo {

	public static void main(String[] args) {
		
		HashMap<String ,Integer> hm =  new HashMap<>();
		// keys must be unique
		//HashMap doesn't allow duplicate keys it will update to the current values
		hm.put("Shahid", 11);//inserting (key,values) in HashMap using put Method.
		hm.put("Porkodi", 12);
		hm.put("Prathmesh", 13);
		hm.put("Priyanka", 14);
		hm.put("Porkodi", 15);
		
		//hm.remove("Porkodi");
	//	hm.clone();
		
		//hm.isEmpty();
		
		System.out.println(hm.get("Shahid"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key to search");
		String keyTocheck = sc.next();
		if(hm.containsKey(keyTocheck))
			System.out.println("key found !!! the Value Of Key is"+hm.get(keyTocheck));
		else
			System.out.println("key not found !!!"+hm.get(keyTocheck));
		
		System.out.println("\nprinting keys and values in the HashMap \n");
		
		for( String key : hm.keySet())
			System.out.println(key + " ->"+hm.get(key));

			
			
	
		
		
		
		System.out.println("printing only keys "+hm.keySet());//to get all key values.
		System.out.println("\nprinting only values "+hm.values());//to get all the value of HashMap.
		//System.out.println();
		
		
		
		}
	

	}


