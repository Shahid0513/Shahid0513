import java.util.*;

public class ArraySeq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int A[] = new int[N];

		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();

		}
		int b =N*K;
		int B[] = new int[b];



		for(int i=0;i<N*K;i++)
		{
			B[i] = A[i%A.length];
		}


		//	for(Integer i : B)
		//	System.out.println("B ->"+i);
		int sum=B[0];
		System.out.println("p[1] ->"+sum);
		//	int ans=0;

		for(int i=2; i<=K;i++)
		{
			sum = sum  + B[i];

			System.out.println("p["+i+"] ->"+sum);
			


		}


		//System.out.println("sum ->"+sum);

		System.out.println(sum-B[0]);
	}

}
