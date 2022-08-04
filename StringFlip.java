package dsaproblemsolving;
import java.io.*;
public class StringFlip {
	
	
		static boolean isSubsequence(String str1, String str2,
									int m, int n)
		{
			// Store index of str1
			int j = 0;

			
			for (int i = 0; i < n && j < m; i++)
				
				if (str1.charAt(j) == str2.charAt(i))
					j++;

			
			return (j == m);
		}

		
		static void findMinimumNumber(String s)
		{
			int r = Integer.parseInt(s, 2);
			
			int ans = r + 1;
			for (int i = 0; i <= r; i++) {

				
				String p = "";
				int j = i;
				while (j > 0) {
					p += (j % 2) + "";
					j = j / 2;
				}

				int m = p.length();
				int n = s.length();

				StringBuilder sb = new StringBuilder(p);
				sb.reverse();
				p = sb.toString();

				// Check if the string is not a subsequence
				if (!isSubsequence(p, s, m, n)) {

					// Update ans and break
					ans = i;
					break;
				}
			}

			System.out.println(ans);
		}


		public static void main(String[] args)
		{
			String s = "101";

			findMinimumNumber(s);
		}
	}


