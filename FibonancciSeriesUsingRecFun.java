import java.util.*;
public class FibonancciSeriesUsingRecFun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fiblen =n;
		for(int i=0;i<fiblen;i++)
		{
			System.out.println(fib(i));

			
			//System.out.println(fib(n-1));
		}
		

	}
	
public	static int fib(int n) {
		if (n==1 || n==2 )
			return 1;
		
		return (fib(n-1) + fib(n-2));
	}
}
