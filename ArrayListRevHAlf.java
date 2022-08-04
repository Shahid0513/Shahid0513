import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ArrayListRevHAlf {
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " numbers to add in the array list");
		for (int i = 0; i< n; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println(al.size());
		System.out.println(al);
		
		
			List<Integer> first = new ArrayList<Integer>();
	        List<Integer> second = new ArrayList<Integer>();
	 
	       
	        int size = al.size();
	// int size2=size/2;
	        
	        for (int i = 0; i <  size / 2; i++) {
	            first.add(al.get(i));
	            }
	        System.out.println(first);
	 
	       
	        for (int i = size / 2; i < size; i++) {
	            second.add(al.get(i));
	            }
	        Collections.reverse(second);
	        System.out.println(second);
	}
}
