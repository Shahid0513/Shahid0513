import java.util.*;

public class OQueueExDemo {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		Queue<Integer> pq1 = new PriorityQueue<>();
		  
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        pq1.add(9);
  
        System.out.println(pq+""+pq1);
	}

}
