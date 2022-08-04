import java.util.Scanner;
public class Main2 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter size");
		 int size = sc.nextInt();
		 int y;
		 int x;
		 
		 int[] array = new int[size];
		 
		 System.out.println("enter "+size+" values:");
		 for(int index=0; index < size; index++)
		 {
			 array[index] = sc.nextInt();
			 
		 }
		 int min = array[0];
		 for(int i=1;i<size;i++)
		 { 
			if(array[i] %2 != 0)
			{
			
				 if(array[i] < min) 
				 {
					 	min = array[i];
				 }
			}
				
		 }
		 int max = array[0];
		 for(int i=1; i<size; i++)
		 {
			 
			
				 if(array[i] > max) 
				 {
				  
					 max=array[i];
				 }
			
		}int sum=0;
		 for(int i =0; i<array.length;i++)
			{
				//int sum=0;
				//System.out.print(sum);
				
			
				sum = array[i] + sum;
			//	System.out.println(sum);
			}
		 y=Math.abs(min-max);
		int z=Math.abs(y*size);
		// x=Math.abs(z-sum);
		// x=abs(x); 
	//	n=6 5+14+6+9+5+88
		//min odd = 5 macodd =9 
		//y=5-9=4
		//4*6=24
		//123-24=
		//n=3=6+3+69+8
		//modd = 3 modd = 69
		//y=69-3=66
		//66*5=330
		//330-89=241
		
		//n=12
		//n=1+2+3+4+5+6+7+8+90+11+12+32
		//sum=181
		//y=1-11=10
		//10*12=120
		//120-181=159
		//1-90=y=89
		//89*12=1086
		//1086-181=905
		
		
				
				 // x=y*size-sum;
		 System.out.println(sum);
		 x=Math.abs(z-sum);
		 System.out.println(" min  "+min);
		System.out.println(" max "+max);
		System.out.println("y -> " +y);
		System.out.println("z="+z);
		System.out.println("x="+x);
		 System.out.println("--------------------------");
		}
}
