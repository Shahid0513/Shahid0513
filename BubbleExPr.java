import java.util.Arrays;

public class BubbleExPr {

	public static void main(String[] args) {
		
		int[] a = {6,5,3,2,1,4,8};
		for(int j = 0; j < a.length-1; j++)
		{
			for(int i = 0;  i < a.length-1-j; i++)
			{
				if(a[i] > a[i + 1])
				{
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				System.out.println("i loop-"+i+"------");
				for( int x : a)
				System.out.println("xarray elements :"+x);
			}
			System.out.println("-------------------"+j+"------------------------");
		}
		System.out.println("\n"+Arrays.toString(a));
	}

}
