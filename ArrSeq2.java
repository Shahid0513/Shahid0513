import java.util.*;

public class ArrSeq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[] = new int[12];
		int k=4;
		for(int i=0;i<12;i++)
		{
			b[i] = a[i%a.length];
			System.out.println(b[i]);
		}

	}

}
