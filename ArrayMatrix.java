import java.util.*;
public class ArrayMatrix {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt();
		
		int row =  sc.nextInt();
		int cols = sc.nextInt();
		int a[][] = new int [row][cols];
		
		for(int i = 0; i< row; i++)
		{
			for(int j= 0; j < cols; j++)
			{
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		for(int i = 0; i< row; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
