import java.util.*;
public class Multipleof3in2DMatrisx {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows:");
		int rows = sc.nextInt();

		System.out.println("Enter cols:");
		int cols = sc.nextInt();

		

		int[][] a = new int[rows][cols];

		
		System.out.println("enter " + (rows * cols) + " elements:");
		for (int i = 0; i < rows; i++) { // rows

			for (int j = 0; j < cols; j++) {

				a[i][j] = sc.nextInt();
			}

		}

		System.out.println("Printing " + "multiple of 3" + " elements in a Matrix format:");
		for (int i = 0; i < rows; i++) { // rows
			for (int j = 0; j < cols; j++) {
				if(a[i][j] % 3 == 0) {

				System.out.print(a[i][j] + " ");
				}
			}
			System.out.println(); 
		}
	}
}
