package dsaproblemsolving;
import java.util.Arrays;
import java.util.Scanner;
/* 
 2) Find all indices of a given element in sorted form of given Array

Difficulty Level : Easy

Given an array arr[] of integers of size N and a target value val. Your task is to find the indices of val in the array after sorting the array in increasing order.

Note: The indices must be in increasing order.

Examples: 

Input: arr = [1, 2, 5, 2, 3], val = 2
Output: 1 2
Explanation: After sorting, arr[] becomes [1, 2, 2, 3, 5]. The indices where arr[i] = 2 are 1 and 2. As the indices should be in increasing order, that’s why they are   (1, 2) and not (2, 1)

Input: arr = [1, 2, 5, 2, 3], val = 6
Output: []
Explanation: After sorting, nums is [1, 2, 2, 3, 5]. The value 6 is not present in the array. 

 

Naive Approach: The concept of this approach is based on sorting. The array is sorted in increasing order. Then the sorted array is traversed. While traversing the array if any value matches the target, that index is added to the answer list. After the iteration is complete the answer list is returned.

 */


public class SortArrayindi {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,5,2,3};
		int val =2;

		//Arrays.sort(arr);
		/*for(Integer i : arr)
		{
			System.out.println(i);
		}*/

		
		
		//sorting in increasing order
		  for (int i = 0; i < arr.length; i++)   
			{  
			  for (int j = i + 1; j < arr.length; j++)   
			  {  
				  int tmp = 0;  
				  if (arr[i] > arr[j])   
					{  
						tmp = arr[i];  
						arr[i] = arr[j];  
						arr[j] = tmp;  
					}  
			  }
			}
		  //compare
		for(int i1=0;i1<arr.length-1;i1++)
		{
			if(arr[i1] == val)
			{
				//printing matched indices
				System.out.println(i1);	


			}
		}
	}

	
}
