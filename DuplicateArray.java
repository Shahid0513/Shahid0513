package da_3_assement;
import java.util.*;
public class DuplicateArray {
	public static void main(String[] args) {
        
		int A[] =new int [10];//
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<A.length;i++)
		{
			A[i] = sc.nextInt();
		}
		for(int i=0;i<A.length;i++)
		{
			if(A[i] == A[i+1])
			{
				System.out.println(A[i]);
				break;
			}
		}
	}
	
	/*class Num{
 
// This function assumes array is sorted, has
// 10 elements, there are total 6 different
// elements and one element repeats 5 times.
static int findDuplicate(int a[])
{
    if (a[3] == a[4])
        return a[3];
    else if (a[4] == a[5])
        return a[4];
    else
        return a[5];
}
 
// Driver code
public static void main(String[] args)
{
    int a[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30};
    System.out.println(findDuplicate(a));
}
}*/
}
