import java.util.*;
public class Main1 {
	//package com.demo;
	 
	
	 
	//public class Main {
	 
	private static Scanner sc;
	 
	public static void main(String[] args) {
	int n;
	int[] a = new int[10];
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for (int i = 0; i < n; i++) {
	a[i] = sc.nextInt();
	}
	boolean s = checkTripplets(a);
	if (s)
	System.out.println("TRUE");
	else
	System.out.println("FALSE");
	}
	 
	public static boolean checkTripplets(int[] a) {
	boolean b = false;
	for (int i = 0; i < a.length - 3; i++) {
	if ((a[i] == a[i + 1]) && (a[i + 1] == a[i + 2])) {
	b = true;
	}
	else if ((a[i] != a[i + 1]) && (a[i + 1] != a[i + 2])) {
		b = false;
		}


	
		//b=false;
	
	}
	return b;
	}
	 
	}

