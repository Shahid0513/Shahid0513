import java.util.*;
public class InsertionSortEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// to calculate in how many pass the insertion sorting done
			// get size of array -1
			// 6-1=5 passes
		int[] arr= {6,5,4,3,2,1};
		int N=arr.length;
		
		for(int i=1;i<N;i++) {
			int temp=arr[i];
			//using while loop
//			int j=i-1;
//			while(j>=0 && arr[j]>temp) {
//				arr[j+1]=arr[j];
//				j--;
//				//System.out.println("temp : "+temp);
//				
//			}
			//using for loop
			int j;
			for(  j = i - 1;j >= 0; j--)
			{
				if(arr[j] > temp)
				{
					arr[j + 1] = arr[j];
				}
			
			}
			arr[j+1]=temp;
			System.out.println("after  "+i+ "  pass");
			for(int x : arr)
				System.out.println(x);
			
		}
		//for(int x1: arr)
		//	System.out.println(x1);
		System.out.println(Arrays.toString(arr));
	}

}
