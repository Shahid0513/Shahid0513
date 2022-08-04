package dsaproblemsolving;
import java.util.*;
public class SufficeantSellArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int earr[] = new int[N];
		int carr[] = new int[N];
		
		for(int i=0;i<N;i++)
		{
			earr[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++)
		{
			carr[i] = sc.nextInt();
		}
		int sum=0;
		
		int fsum=0;
		//int esum=0;
		for(int i=0;i<N;i++)
		{
			//if(earr[i] - carr[i] < 0)
			earr[i] = earr[i] - carr[i];
			
			//System.out.println(i+" -> "+esum);
		}
		
		
		
		for(int i=0;i<N;i++)
		    {
		        sum+=earr[i];
		        if(sum<0)
		        {
		         sum = -sum;
		         fsum= Math.abs(fsum +sum) ;
		         sum=0;
		        }
		    }
		//	if(earr[i] < carr[i]) {
				//fsum = sum;
			//	System.out.println(i+" er < cr -> "+fsum);
				
			
		//}
		//System.out.println(fsum);
		System.out.println(fsum);

	
}
}
