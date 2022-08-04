package Map;
import java.util.*;
	
public class MinMaxevOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter array size: \n");
		int size = sc.nextInt();
		int a[] = new int [size];
		int min =a[0], max=a[0];
		
		for(int ae=0; ae<size;ae++)
		{
			a[ae]=sc.nextInt();
		}
		
		for(int i=1; i< size; i++)
		{
			if(a[i] <  min)
			{
				min=a[i];
			}
		}
		for(int j=1; j< size; j++)
		{
			if(a[j] > max)
			{
				max=a[j];
			}
		}
		System.out.println("min ->"+min+"  max ->"+max);
	}

}
