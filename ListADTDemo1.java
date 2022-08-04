import java.util.ArrayList;
import java.util.Scanner;

public class ListADTDemo1 {
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		if (al.size() == 0)
			System.out.println("List is Empty");
		
		if( al.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("list has elements");
		
		
		// Inserting a element at the end
		al.add(12);
		al.add(13);
		al.add(14);
		
		
		
		al.add(0, 11); 
		al.add(2, 88);
		
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
//		
		
		al.remove(3); // deletes at index -3
		
		System.out.println("After removing");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want to search in the list");
		int elmtToSearch = sc.nextInt();
		
		
		
		if(al.contains(elmtToSearch))
			System.out.println("The given element present in the array list");
		else
			System.out.println("The given element not present in the array list");
		
		
		
		System.out.println(al.indexOf(elmtToSearch));
		
		al.add(88);
		System.out.println("After adding 88 again");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
	
		
		System.out.println(al.indexOf(elmtToSearch)); 
		
		System.out.println(al.lastIndexOf(elmtToSearch));
		
		al.add(88); // no
		System.out.println("After adding 88 again");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
		System.out.println(al.indexOf(elmtToSearch)); 
		// this return only index 2 not the index 4
		
		System.out.println(al.lastIndexOf(elmtToSearch));
		
		

	

}



}
