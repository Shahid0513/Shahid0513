//printing the minimun and maximum element in the array
//printing the minimum odd number and maximum even number present in array


import java.util.Scanner;

public class ArrayMinAndMax {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter size");
		 int size = sc.nextInt();
		 int M = sc.nextInt();
			 
		 int[] array = new int[size];
		 
		 System.out.println("enter "+size+" values:");
		 for(int index=0; index < size; index++)
		 {
			 array[index] = sc.nextInt();
			 
		 }
		 int min = array[0];
		 for(int i=1;i<size;i++)
		 { 
			//if(array[i] %2 != 0)
			//{
			
				 if(array[i] < min) 
				 {
					 	min = array[i];
				 }
				 for(int j=0;j<M;j++)
				 {
					 min= array[j] * 2;
				 }
			//}
				
		 }
		/* int max = array[0];
		 for(int i=1; i<size; i++)
		 {
			 
			
				 if(array[i] > max) 
				 {
				  
					 max=array[i];
				 }
			
		}
		*/ 
		 System.out.println(" min  "+min);
		// System.out.println(" max "+max);
		 System.out.println("--------------------------");
		/* int min1 = array[0];
		 for(int i=1;i<size;i++)
		 { 
			
			if(array[i] %2 != 0)
			{
				 if(array[i] < min1) 
				 {
					 	min1 = array[i];
				 }
			}
			
				
		 }
		 int max1 = array[0];
		 
		 for(int i=1; i<size; i++)
		 {
			 
			if(array[i] %2 == 0) 
			 {
				 if(array[i] > max1) 
				 {
				  
					 max1=array[i];
				 }
			}
		}
		 
		 System.out.println(" min odd "+min1);
		 System.out.println(" max even "+max1);
		
		*/
	}

}
