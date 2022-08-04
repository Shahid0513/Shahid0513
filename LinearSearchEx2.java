import java.util.*;
public class LinearSearchEx2 {
	public static void main(String[] args) {
		// array
		// k -> element to search
		int arr[] = { 3, 4, 5, 8 , 9};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to search in the array: ");
		int k = sc.nextInt();//}
	// static int linearSearch(int arr[] , int k) {
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == k)
			{
				System.out.println("1");
				
			}
			else if(arr[i] != k)
			{
				System.out.println("0");
				//break;
			}
		
		}
	}
}


