import java.util.Scanner;

public class Pattern2 {
/*
 *   *
 *  **
 * *** 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int line = 1; line <= n; line++)
		{
			for(int spaces =n-line; spaces > 0; spaces--)
			{
				System.out.print(" ");
			}
				for(int star=1; star<=line; star++)
				{
					
				
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
