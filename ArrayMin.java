import java.util.*;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i< n; i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i =0;i<n;i++)
		{
		 System.out.println(a[i]);
		}
		
		int min= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
