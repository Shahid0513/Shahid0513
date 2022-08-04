import java.util.*;
public class MaximumAbsoluteDifrence {
	public static void main(String[] args) {
		/*	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i =0 ; i<n ; i++) {
			int num = sc.nextInt();
			al.add(num);
		}


		ArrayList<Integer> evenNums = new ArrayList<>();
		ArrayList<Integer> oddNums = new ArrayList<>();

		for (int i =0 ; i<n ; i++) {
			int num = al.get(i);
			if (num % 2 == 0) {
				evenNums.add(num);
			}else {
				oddNums.add(num);
			}
		}

		int minEven = Collections.min(evenNums);
		System.out.println(minEven);
		int maxEven = Collections.max(evenNums);
		System.out.println(maxEven);
		int minOdd = Collections.min(oddNums);
		System.out.println(minOdd);
		int maxOdd = Collections.max(oddNums);
		System.out.println(maxOdd);
		int x = maxEven - minEven;
		System.out.println("x -> "+x);
		int y = maxOdd - minOdd;
		System.out.println("y -> "+y);
		System.out.println(x+y);



		 */

	/*	Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]  = sc1.nextInt();
		}

		//	for(int elm : arr)
		//		System.out.println(elm);

		/*	int sumofarr =0;

		for(int i = 0;i<size;i++)
		{
			sumofarr +=arr[i];
		}
		System.out.println(sumofarr);
		System.out.println("enter size of y -> ");
		int y = sc1.nextInt();
		int x = y * size - sumofarr;
		System.out.println("x -> "+x);

		 */
		
		/*
		Scanner sc2 = new Scanner(System.in);
		int size1 = sc2.nextInt();

		int array[] =  new int[size1];

		for(int i=0;i < size1; i++)
		{
			array[i] = sc2.nextInt();

		}


		for(int i = 0; i < size1; i++)
		{
			int wsum=0;

			for(int j = 0; j < size1;j ++)
			{
				if(i != j) {
					wsum +=array[j];
				}
				
			}
			System.out.println(wsum);
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you go enter? ");
		int n = sc.nextInt();
		
		ArrayList<Integer>  al = new ArrayList<>();
		
		System.out.println("Enter " + n + " numbers: ");		
		for(int i =0 ; i< n; i++ ) {
			// int n1 = sc.nextInt();
		   // al.add(n1);
			al.add(sc.nextInt());
		}
		
		System.out.println("How many times you want to do left shift? ");
		int k = sc.nextInt();
		
		System.out.println("Priniting " + n + " values in the array list");
		for(int i = 0; i < n; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Printing elements after "  +  k  + "  left shifts");
		for (int i =k; i < n ; i++) {
			
			System.out.println("i -> "+i);
			System.out.println(al.get(i));
		}
		for (int i =0; i < k ; i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("Printing elements after "  +  k  + "  rightt shifts");
		for(int i = n-k; i < n ; i++) { //n-k -> last k elements
			System.out.println(al.get(i));
		}
		for(int i = 0; i < n-k; i++) {
			System.out.println(al.get(i));
		}

	}*/
		//public static void main(String[] args) {
			// 1. I have to get the number of rows and cols
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter rows:");
			int rows = sc.nextInt();
			
			System.out.println("Enter cols:");
			int cols = sc.nextInt();
			
			//2. declare the array with row & cols
			
			int[][] a = new int[rows][cols];
			
			//3. get the rows* cols elemts from the user
			System.out.println("enter " + (rows * cols) + " elements:");
			 for (int i = 0; i < rows ; i++) { // rows 
				 
				 for (int j = 0; j < cols; j++) {
					 
					 a[i][j] = sc.nextInt();
				 }
				 
			 }
			 
			 System.out.println("Printing " + (rows * cols) + " elements in a Matrix format:");
			 for (int i = 0; i < rows ; i++) { // rows 	 
				 for (int j = 0; j < cols; j++) {

					System.out.print(a[i][j] +  " ");
				 }
				 System.out.println(); // creates a new line after each rows
			 }
			 
			 System.out.println("Printing the left diagonal elmts"); 
			 for (int i = 0; i < rows ; i++) { // rows 	 
				 for (int j = 0; j < cols; j++) {
				 if(j % 3 == 0){//1 -> 0,0  5 -> 1,1 9 -> 2,2
					 //i and j are equal for all of my diagonal elements
					
						System.out.println(a[i][j]);
						 
				 }
			 }
	}
	}
			 
}
