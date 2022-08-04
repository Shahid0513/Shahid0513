package dsaproblemsolving;
import java.util.*;
public class PeopleHousesInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner (System.in);

		int n=sc.nextInt();

		int parr[]= new int[n];
		int harr[]= new int[n];


		for(int i=0; i<n; i++)
		{
			parr[i]=sc.nextInt();
		}

		for(int i=0; i<n; i++)
		{
			harr[i]=sc.nextInt();
		}  
		
		int count = 0;

		for(int i=0; i<n; i++)
		{

			for(int j=0; j<n; j++)
			{

				if(parr[i]<harr[j])
				{
					count+=1 ;
					harr[j]=-1;
					break;
				}
			}
		}
		// count -=  parr.length;
		//count -=n;
		System.out.println(Math.abs(n-count));


	}

}
