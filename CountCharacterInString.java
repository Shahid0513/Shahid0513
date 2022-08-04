package Map;
import java.util.*;
public class CountCharacterInString {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();
		HashMap < Character, Integer> hm = new HashMap<>();
		 for(int i = 0 ; i < s.length(); i++) {
			 Character ch = s.charAt(i);
			  if(hm.containsKey(ch))
			  {
				  int pcnt = hm.get(ch);
				  hm.put(ch,  ++pcnt);
				  
			  }
			  else
			  {
				  hm.put(ch,  1);
			  }
		 }
			  
			  for(Character key : hm.keySet())
			  {
				  System.out.println(key + ">"+hm.get(key));
			  }
			  System.out.println("enter the character");
			  Character chTocheck = sc.next().charAt(0);
			  
			  if(hm.containsKey(chTocheck))
			  {
				  System.out.println("the count of character "+chTocheck + " is "+hm.get(chTocheck));
				  
			  }
			  else
			  {
				  System.out.println("the count of character"+chTocheck+"is 0 "+ " \nCharacter is not present in String");
			  }
			 
		 }
		
		

	

}
