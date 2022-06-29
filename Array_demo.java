package garimachikaramam;

import java.util.*;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a = 7; int b= 9; System.out.println(a +" "+b); swap(a,b);
		 * System.out.println(a +" "+b); } public static void swap(int a, int b) { int t
		 * = a; a = b; b = t;
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}