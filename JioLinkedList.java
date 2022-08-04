import java.util.*;
import java.math.*;
//import java.Collection.*;
public class JioLinkedList {
public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();	
		
		for(int i=0;i<n; i++)
		{
			ll.add(sc.nextInt());
		}
	
		Collections.sort(ll);
		Collections.reverse(ll);
	
		//int n2=n/2;
		int sum=0;
	
		//for (int i1=0;i1 < n;i1++) {
			
		
			sum = ll.get(0) + ll.get(1) + ll.get(2);
			
		//}
		System.out.println(sum);
		
			
}
}

