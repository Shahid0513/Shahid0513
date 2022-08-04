package dsaproblemsolving;
import java.util.*;
public class CntOfEqStr {
	
	static int findAnswer(String str1, String str2, int n)
	{
		int l = 0, r = 0;
		int ans = 2;

		
		for (int i = 0; i < n; ++i)
		{
			if (str1.charAt(i) != str2.charAt(i))
			{
				l = i;
				break;
			}
		}

		
		for (int i = n - 1; i >= 0; i--)
		{
			if (str1.charAt(i) != str2.charAt(i))
			{
				r = i;
				break;
			}
		}

		
		if (r < l)
			return 26 * (n + 1);

		
		else if (l == r)
			return ans;
		else {

			
			for (int i = l + 1; i <= r; i++)
			{
				if (str1.charAt(i) != str2.charAt(i - 1))
				{
					ans--;
					break;
				}
			}

			
			for (int i = l + 1; i <= r; i++)
			{
				if (str1.charAt(i-1) != str2.charAt(i))
				{
					ans--;
					break;
				}
			}

			return ans;
		}
	}

	
	public static void main(String args[])
	{
		String str1 = "toy", str2 = "try";
		int n = str1.length();
		System.out.println(findAnswer(str1, str2, n));
		
	}
	}



