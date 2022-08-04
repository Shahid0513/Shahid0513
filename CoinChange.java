package dsaproblemsolving;

import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int coins[] = new int[n];

		for (int i =0; i < n; i++)
		{
			coins[i] = sc.nextInt();
		}

		int V = sc.nextInt();



		int table[][] = new int[n+1][V+1];


		for(int j = 1; j <= V; j++) 
		{
			table[0][j] = V +1;
		}

		for (int i =1; i <=n ; i++) 
		{
			for (int j = 1; j <= V; j++) 
			{
				int index = i -1;

				if ( j >= coins[index]) 
				{
					table[i][j] = Math.min(table[i-1][j], 1 + table[i][j - coins[index]]);
				}
				else 
				{
					table[i][j] = table[i-1][j];
				}
			}
		}
		int reqcoin = table[n][V];
		for(int i=0;i<n;i++)
		{
			if(V < coins[i])
			{
				System.out.println("-1");
				break;

			}
			else {


				System.out.println(reqcoin);
				break;
			}
		}
	}

}
