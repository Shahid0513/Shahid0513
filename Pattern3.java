import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
	/*	
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
*/
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{for(int spaces =n-i; spaces > 0; spaces--)
		{
			System.out.print(" ");
		}
			
			for(int j =1; j <= i; j++)
			{
				System.out.print("*");
			}
			for(int spaces =n; spaces > 0; spaces--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
