package dsaproblemsolving;
import java.util.*;
class GoldMineProblemInfo {
static int collectGold(int[][] gold, int x, int y,
						int n, int m)
{

	// Base condition.
	if ((x < 0) || (x == n) || (y == m)) {
	return 0;
	}

	// Right upper diagonal
	int rightUpperDiagonal
	= collectGold(gold, x - 1, y + 1, n, m);

	// right
	int right = collectGold(gold, x, y + 1, n, m);

	// Lower right diagonal
	int rightLowerDiagonal
	= collectGold(gold, x + 1, y + 1, n, m);

	// Return the maximum and store the value
	return gold[x][y]
	+ Math.max(Math.max(rightUpperDiagonal,
						rightLowerDiagonal),
				right);
}

static int getMaxGold(int[][] gold, int n, int m)
{
	int maxGold = 0;

	for (int i = 0; i < n; i++) {

	
	int goldCollected
		= collectGold(gold, i, 0, n, m);
	maxGold = Math.max(maxGold, goldCollected);
	}

	return maxGold;
}
public static void main(String[] args)
{
	int[][] gold = { { 1,3,3 },
					  { 2,1,4},
					  { 0,6,4}
					};
					
	int m = 3, n = 3;
	System.out.println(getMaxGold(gold, n, m));
}
}


