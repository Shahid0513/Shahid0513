import java.util.*;
public class CollectionDemoOPerations {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		Scanner sc =  new Scanner(System.in);
		int size=sc.nextInt();
		for(int i = 0; i < size; i++)
		{
			int num=sc.nextInt();
			al.add(num);
		}
		System.out.println("size ......"+al.size());
		System.out.println("printing array element \n");
		for(Integer i : al)
		{
			System.out.println(i);
		}
		System.out.println("size...."+al.size());
		Collections.sort(al);
		System.out.println("printing after sorting in asc order \n " );
		for(Integer i : al)
		{
			System.out.println(i);
		}


		Collections.reverse(al);
		System.out.println("printing after reverse order \n ");
		for(Integer i : al)
		{
			System.out.println(i);

		}
		//rotating by 3 it will rotate by 3 and take the 3rd element as 1st and print all the element present in the arrayList.
		Collections.rotate(al, 3);
		System.out.println("printing after rotated \n ");

		for(Integer i : al)
		{
			System.out.println(i);

		}

		System.out.println("traversing arraylist :\n");
		for(int i = al.size()-1; i >= 0 ; i--)
		{
			System.out.println(al.get(i));
		}

		
		System.out.println("min -> "+Collections.min(al));
		

		
		System.out.println("max -> "+Collections.max(al));
		

	}

}
