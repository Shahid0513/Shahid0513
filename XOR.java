import java.util.*;

public class XOR {

	public static void main(String[] args) {
		//int x=5,y=7;
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int K = sc.nextInt();
		
		int A[] = new int[N];
		
		
		
		for(int i=0;i<N;i++)
		{
			A[i] = sc.nextInt();
		}
		
		System.out.println("enter length of ch ");
		int nele = sc.nextInt();
		//System.out.println("enter choice ");
		int ch[]=new int[nele];
		for(int i=0;i<nele;i++)
		{ch[i]=sc.nextInt();}
		
		
		int xor=0;
		
		for(int i=0;i<ch.length-1;i++)
		{
			xor=(ch[i] ^ ch[i]);
		}
		//System.out.println("x ^ y = " + (x ^ y));   
		System.out.println(xor);
	}

}
