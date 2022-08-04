package Map;
import java.util.*;

public class SumOfYwoArray {

	public static void main(String[] args) 
	{
		int a1[] = {9,9,9,9};//		9 9 9 9
							//    +
		int a2[] = {9,9,9}; //		  9 9 9
							//-------------------
							//	  1 0 9 9 8

		int a1s=a1.length;
		int a2s= a2.length;

		int sumarray[] = new int [a1s>a2s ? a1s+1: a2s+1];
		/*int i=sumarray.length-1;
		int j=a1.length-1;
		int k=a2.length-1;
		int carry=0;
		while(i >= 0)
		{
			int sum =carry;

			if(j >= 0)
			{
				sum+=a1[j];
				j--;
			}
			if(k >= 0)
			{
				sum+=a2[k];
				k--;
			}
			sumarray[i] = sum % 10;
			carry =sum / 10;
			i--;


		}
		for( int num : sumarray)
		{
			System.out.println(num);
		}*/
		int carry=0;
		int sum=carry;
		int i=a1.length;
		int j=a2.length;
for( i=a1.length; i>=0;i--)
{
	
	
	if(i >= 0)
	{
		sum+=a1[i];
	}
	

for(j=a2.length; j >= 0; j--)
{	 
	if(j >= 0)
	{
		sum+=a2[j];
	}
	
}
sumarray[i]=sum%10;
carry=sum/10;
}
for( int num : sumarray)
{
	System.out.println(num);
}

	}

}


