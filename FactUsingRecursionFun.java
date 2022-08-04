import java.util.*;

public class FactUsingRecursionFun 
{
	public static void main(String[] args) 
	{



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("factoreal using for loop "+n +" : "+ factforloop(n));
		System.out.println("factoreal using Recursive fun "+n +" : "+ factRecFun(n));
	}

	public static int factforloop(int n) 
	{
		int fact=1;

		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
			//System.out.println(fact);
		}
		return fact;
	}



	public static int factRecFun(int n)
	{ 
		if (n == 0)
			return 1;

		return  n * factRecFun(n-1);
	}

}
