package DynamicProgramingPractice;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Stringeqcnt {
/*
	public static void main(String[] args) {
		
		String s1 = "try";
		String s2 = "toy";
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		
		System.out.println(sb1+" "+sb2);
		
		sb2.deleteCharAt(0);
		sb2.deleteCharAt(0);
		
		int eqcnt=0;
		if(sb1.equals(sb2))
		{
			eqcnt++;
		}
		else
		{
			System.out.println("no");
		}

	}
*/
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1 = sc.nextLine();
		System.out.println("Enter s2:");
		String s2 = sc.nextLine();

		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		
		int count_s1[] = new int[26];
		int count_s2[] = new int[26];
				
		//Counting how many A's to Z's in the s1 string and
		//storing it in the count array
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch != ' ') {
				int countIndex = ch - 97;
				count_s1[countIndex]++;
				//System.out.println(countIndex);
			}
		}

		//Counting how many A's to Z's in the s2 string and
		//storing it in the count array
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch != ' ') {
				int countIndex = ch - 97;
				count_s2[countIndex]++;
			}
		}
		
		//comparing the 2 count arrays
		// if i says 2 a's in s1 that should be the same is in s2
		//then only its an anagram
		boolean isAnagram = true;
		for(int i =0; i< 26; i++ ) {
			if(count_s1[i] != count_s2[i]) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("s1 and s2 are anagrams");
		}
		else {
			System.out.println("s1 and s2 are not anagrams");
		}
		
		
		
		
		sb1.deleteCharAt(0);
		sb2.deleteCharAt(0);
		System.out.println(sb1+"  "+sb2);
		
		
		int eqcnt=0;
		String s3 = sb1.toString();
		String s4 = sb2.toString();
		if(s3.equals(s4)) {
			eqcnt++;
	    System.out.println(eqcnt);}
		else
		{
			System.out.println("non");
		}

	}

	
	
	
	
	
}
