package dsaproblemsolving;
import java.util.*;
public class HR {
	 
	 ///not proper ans is comming
	//public static int returnFun(int arr[])
	//{
		//Scaneer sc = new Scanner(System.in);
				//int m[]=new int [arr];
				
		
		//for(int i=0;i<arr.length-1;i++)
		//{
			//sum=(arr[i+m]+arr[i+m]);
		//}
	//	return sum;
	
	
//}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int  sum = 0;
		int m[] = {10,55,220,715};
	/*	*/
		for(int i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
	//	System.out.println(returnFun(arr));
		//int i=0;
		for(int i=0;i<m.length;i++)
		{ 
			
			
			sum +=m[i];
			m[1]=m[3];
		}
						//System.out.println(arr[i]);
		
		System.out.println(sum);
		
		
		
		/*m[0]=0;
		m[1]=10;
		m[2]=55;
		m[3]=220;
		m[4]=715;*/
}
}

