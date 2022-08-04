import java.util.*;

public class WeirdSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			al.add(num);
		}
		
		for(int i=0; i<n; i++)
		{
			int sum =0;
			for(int j=0;j<n;j++)
			{
				if(i != j)
				{
					sum+=al.get(j);
				}
			}
			System.out.println(sum);
		}
		
		
	}

}
