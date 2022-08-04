import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class insSort {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		
		//int array[] = new int[size];
		
		int array[] = { 6,5,4,3,2,1};
		int size = array.length;
		for(int i= 1; i  < size; i++)
		{
			
			int temp = array[i];
			 int j = i-1;
			 
			 while(j >= 0 && array[j]>temp)
			 {
				 array[j+1] = array[j];
				 j--;
			 }
			 array[j + 1] = temp;
			 
			 System.out.println("pass - > "+ i +" "+Arrays.toString(array));
		}
		 System.out.println(" sorted array -> "+Arrays.toString(array));
	}

}
