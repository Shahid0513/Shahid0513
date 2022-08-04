import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		//
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 */
	/*	Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j =1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		//anoter pattern
		/*  ****
		 *  ***
		 *  **
		 *  *
		 * 
		 * 
		 */
		//Scanner sc = new Scanner(System.in);
	/*	System.out.println("-----------------");
		int n1= sc.nextInt();
		
		for(int i = 1; i <= n1; i++)
		{
			for(int j = i; j <= n1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *
		 * ***
		 * *****
		 * *******
		 * 
		 */
/*		System.out.println("-----------------");
		int n2= sc.nextInt();
		for(int i = 1; i <= n; i=i+2)
		{
			for(int j =1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//another pattern
		/* *
		 * ***
		 * *****
		 * *******
		 * *********
		 */

		
		
	/*	
			System.out.println("-----------------");
			Scanner sc = new Scanner(System.in);
		int n3= sc.nextInt();
		int odd=1;
		for(int i = 1; i <= n3; i++)
		{
			for(int j =1; j <= odd; j++)
			{
				System.out.print("*");
			}
			odd=odd+2;
			System.out.println();
		}*/
		
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
	int n4= sc.nextInt();
	int mul=sc.nextInt();
	
	//int odd1=0;
	for(int i = 1; i <= n4; i++)
	{int starcount=mul*i;
		for(int j =1; j <= starcount; j++)
		{
			System.out.print("*");
		}
		//odd1=odd1+3;
		System.out.println();
	}
		
		

	}

}
