package dsaproblemsolving;

public class GoldMinesapproch2 {

	public static void main(String[] args) {
		int m=3;
		int n=3;

		int mat[][]=
			{
					{1,3,3},
					{2,1,4},
					{0,6,4}
			};



		for(int col = n-2; col >= 0; col--) 
		{
			for(int row = 0; row < m; row++) 
			{
				int right = mat[row][col+1];
				int rightup = (row == 0) ? 0 : mat[row-1][col+1];
				int rightdown = (row == n-1) ? 0 : mat[row+1][col+1];

				mat[row][col] = mat[row][col] + Math.max(right,Math.max(rightup,rightdown));

			}
		}
		int tmp=mat[0][0];

		for(int i=1;i<m;i++) 
		{
			tmp=Math.abs(Math.max(tmp,mat[i][0]));
			//System.out.println(tmp);
		}
		System.out.println(tmp);
	}
}


