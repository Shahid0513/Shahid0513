
//printing the sum of array
//taking the input from user and printing the sum of array
import java.util.Scanner;

// printing the sum of array
public class ArraySum {
static int sum=0;
	public static void main(String[] args) {
		int a[]= {8,7,12,6,9,10};
		for(int i =0; i<a.length;i++)
		{
			//int sum=0;
			//System.out.print(sum);
			
		
			sum = a[i] + sum;
			System.out.println(sum);
		}
		
		
		
		System.out.println("taking values from user and adding them");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter size");
		 int size = sc.nextInt();
		 
		 int[] array = new int[size];
		 
		 System.out.println("enter "+size+" values:");
		 for(int index=0; index < size; index++)
		 {
			 array[index] = sc.nextInt();
			 
		 }int sum=0;
		 for(int index=0;index<size;index++)
		 {
			  sum = sum +array[index];
			 System.out.println(" -> "+sum);
		 }
		

	}

}
